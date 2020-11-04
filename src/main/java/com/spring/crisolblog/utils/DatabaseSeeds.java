package com.spring.crisolblog.utils;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.crisolblog.models.Post;
import com.spring.crisolblog.repositories.PostsRepository;

@Component
public class DatabaseSeeds {

    @Autowired
    PostsRepository postsRepository;

    // Sempre que a aplicação for iniciada ele roda essas seeds
    // no banco, para evitar isso basta comentar o "@PostConstruct".
    // @PostConstruct
    public void savePosts() {
        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("NodeJS");
        post1.setAuthor("Vinícius Crisol");
        post1.setCreated_at(LocalDate.now());
        post1.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has");

        Post post2 = new Post();
        post2.setTitle("API REST");
        post2.setAuthor("Michelli Brito");
        post2.setCreated_at(LocalDate.now());
        post2.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        postList.add(post1);
        postList.add(post2);

        for (Post post : postList) {
            Post postSaved = postsRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
