package com.example.docker_compose.controller;

import com.example.docker_compose.model.Post;
import com.example.docker_compose.reponsitory.PostReponsitory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private final PostReponsitory reponsitory;

    public PostController(PostReponsitory reponsitory) {
        this.reponsitory = reponsitory;
    }


    @GetMapping
    public List<Post> findAll(){
        return reponsitory.findAll();
    }

}
