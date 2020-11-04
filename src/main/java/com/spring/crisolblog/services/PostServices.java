package com.spring.crisolblog.services;

import java.util.List;
import com.spring.crisolblog.models.Post;

public interface PostServices {
    List<Post> findAll();
    Post save(Post post);
    Post findById(long id);
}
