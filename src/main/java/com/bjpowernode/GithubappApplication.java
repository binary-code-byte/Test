package com.bjpowernode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubappApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubappApplication.class, args);
        System.out.println("hello");
        System.out.println("我是小明，我的第一次修改");
    }

}
