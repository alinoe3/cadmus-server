package pl.xyz.cadmus.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/post")
@RestController
public class PostEndpoint {

    private final PostFinder postFinder;

    @Autowired
    public PostEndpoint(PostFinder postFinder) {
        this.postFinder = postFinder;
    }

    @GetMapping(params = {"pageNr", "pageSize", "sortOrder", "sortField"})
    public PostTeaserPageView find(@RequestParam(value = "pageNr", required = false) int pageNr,
                                   @RequestParam(value = "pageSize", required = false) int pageSize,
                                   @RequestParam(value = "sortOrder", required = false) SortOrder sortOrder,
                                   @RequestParam(value = "sortField", required = false) String sortField) {
        return postFinder.findTeasers(pageNr, pageSize, sortOrder, sortField);
    }

    @GetMapping(path = "/{postId}")
    public PostView findById(@PathVariable("postId") Long id) {
        return postFinder.findById(id);
    }
}
