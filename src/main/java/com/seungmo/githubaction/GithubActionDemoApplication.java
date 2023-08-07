package com.seungmo.githubaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionDemoApplication {
    public static void main(String[] args) {
        System.out.println("==== ::: Github Action Demo ::: ====");
        SpringApplication.run(GithubActionDemoApplication.class, args);
    }
}
