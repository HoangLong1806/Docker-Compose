package com.example.docker_compose.reponsitory;

import com.example.docker_compose.model.Post;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PostReponsitory extends ListCrudRepository<Post, Integer> {

}
