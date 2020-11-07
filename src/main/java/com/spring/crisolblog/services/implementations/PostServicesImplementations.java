package com.spring.crisolblog.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.crisolblog.models.Post;
import com.spring.crisolblog.services.PostServices;
import com.spring.crisolblog.repositories.PostsRepository;

@Service
public class PostServicesImplementations implements PostServices {
    
    @Autowired
    PostsRepository postsRepository;

    @Override
    public List<Post> findAll() {
        return postsRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return postsRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return postsRepository.save(post);
    }
}
