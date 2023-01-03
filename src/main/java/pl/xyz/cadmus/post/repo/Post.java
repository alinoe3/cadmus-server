package pl.xyz.cadmus.post.repo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;
import pl.xyz.cadmus.person.repo.Person;

import java.time.LocalDateTime;

@Getter
@ToString(of = {"id", "title"})
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "introduction")
    private String introduction;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Person author;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;
}
