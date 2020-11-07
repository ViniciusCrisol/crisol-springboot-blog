package com.spring.crisolblog.controllers;

import com.spring.crisolblog.models.Post;
import com.spring.crisolblog.services.PostServices;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    PostServices postServices;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = postServices.findAll();
        mv.addObject("posts", posts);

        return mv;
    }
}
