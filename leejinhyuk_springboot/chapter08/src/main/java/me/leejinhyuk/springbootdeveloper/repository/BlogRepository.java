package me.leejinhyuk.springbootdeveloper.repository;

import me.leejinhyuk.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
