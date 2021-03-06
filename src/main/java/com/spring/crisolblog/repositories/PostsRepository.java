package com.spring.crisolblog.repositories;

import com.spring.crisolblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Post, Long> {}
