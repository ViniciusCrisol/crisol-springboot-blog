package com.spring.crisolblog.services;

import com.spring.crisolblog.models.Post;
import java.util.List;

public interface PostServices {
    Post save(Post post);
    List<Post> findAll();
    Post findById(long id);
}
