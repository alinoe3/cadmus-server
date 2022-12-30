package pl.xyz.cadmus.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
public class PostTeaserPageView {

    private List<PostTeaserView> posts;
    private Integer pageCount;
}
