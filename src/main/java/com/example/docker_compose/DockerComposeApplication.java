package com.example.docker_compose;

import com.example.docker_compose.model.Post;
import com.example.docker_compose.reponsitory.PostReponsitory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerComposeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerComposeApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PostReponsitory reponsitory){
        return args -> {
            reponsitory.save(new Post("First Post", "This is my first post"));
        };
    }
}
