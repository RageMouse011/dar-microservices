package kz.dar.tech.postcoreapi.repository;


import kz.dar.tech.postcoreapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, String> {
}
