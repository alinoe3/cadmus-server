package pl.xyz.cadmus.person;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class PersonView {

    private Long id;
    private String login;
    private String firstName;
    private String lastName;
}
