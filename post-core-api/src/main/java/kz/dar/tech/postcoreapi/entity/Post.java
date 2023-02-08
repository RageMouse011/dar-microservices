package kz.dar.tech.postcoreapi.entity;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_id")
    private String postId;

    @Column(name="client_id")
    @NotNull
    private String clientId;

    @Column(name="post_recipient_id")
    @NotNull
    private String postRecipientId;

    @Column(name="post_item")
    private String postItem;

    @Column(name="status")
    private String status;
}
