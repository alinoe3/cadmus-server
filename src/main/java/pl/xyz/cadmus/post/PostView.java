package pl.xyz.cadmus.post;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import pl.xyz.cadmus.person.PersonView;

import java.time.LocalDateTime;

@Getter
@Builder(setterPrefix = "with", builderMethodName = "aPostView")
@ToString(of = {"title"})
public class PostView {

    private Long id;
    private String title;
    private String introduction;
    private String content;
    private PersonView author;
    private LocalDateTime createdDate;
    private Integer commentCount;
}
