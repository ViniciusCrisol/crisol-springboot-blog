package com.spring.crisolblog.services.implementations;

import com.spring.crisolblog.models.Post;
import com.spring.crisolblog.repositories.PostsRepository;
import com.spring.crisolblog.services.PostServices;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



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
