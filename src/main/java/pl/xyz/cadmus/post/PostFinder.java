package pl.xyz.cadmus.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.xyz.cadmus.person.PersonView;
import pl.xyz.cadmus.person.repo.Person;
import pl.xyz.cadmus.post.repo.Post;
import pl.xyz.cadmus.post.repo.PostRepository;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;


@Service
@Transactional(readOnly = true)
public class PostFinder {

    private static final Logger log = LoggerFactory.getLogger(PostFinder.class);

    private final PostRepository postRepository;

    @Autowired
    public PostFinder(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostTeaserPageView findTeasers(int pageNr, int pageSize, SortOrder sortOrder, String sortField) {
        Pageable pageable = PageRequest.of(pageNr, pageSize, buildSort(sortOrder, sortField));

        Page<Post> page = postRepository.findAll(pageable);

        if (pageable.getPageNumber() > page.getTotalPages() - 1) {
            throw new RuntimeException("The page is outside the scope.");
        }

        log.info("Found {}", page);

        return new PostTeaserPageView(buildPostTeaserViews(page), page.getTotalPages());
    }

    public PostView findById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new RuntimeException("No post with id " + id));

        return PostView.aPostView()
                .withId(post.getId())
                .withTitle(post.getTitle())
                .withIntroduction(post.getIntroduction())
                .withContent(post.getContent())
                .withCreationDate(post.getCreationDate())
                .withAuthor(buildAuthor(post.getAuthor()))
                .build();
    }

    private static List<PostTeaserView> buildPostTeaserViews(Page<Post> result) {
        return result.getContent()
                .stream()
                .map((post -> PostTeaserView.builder()
                        .id(post.getId())
                        .title(post.getTitle())
                        .introduction(post.getIntroduction())
                        .author(buildAuthor(post.getAuthor()))
                        .creationDate(post.getCreationDate())
                        .commentCount(new Random(432).nextInt(20))
                        .build()))
                .collect(Collectors.toList());
    }

    private static PersonView buildAuthor(Person author) {
        return PersonView.builder()
                .id(author.getId())
                .login(author.getLogin())
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                .build();
    }

    private static Sort buildSort(SortOrder sortOrder, String sortField) {
        return Optional.of(sortField)
                .map(val -> {
                    Sort sortTmp = Sort.by(val);
                    if (sortOrder == SortOrder.ASC) {
                        sortTmp = sortTmp.ascending();
                    } else {
                        sortTmp = sortTmp.descending();
                    }

                    return sortTmp;
                })
                .orElse(Sort.by("CreationDate").descending());
    }
}
