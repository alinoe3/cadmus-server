package pl.xyz.cadmus.post;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import pl.xyz.cadmus.person.PersonView;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString(of = {"title"})
public class PostTeaserView {

    private Long id;
    private String title;
    private String introduction;
    private PersonView author;
    private LocalDateTime createdDate;
    private Integer commentCount;
}
