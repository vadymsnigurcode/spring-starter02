package com.example.springstarter02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringStarter02Application {
    @Autowired
    private RedisUtils redisUtils;

    @PostConstruct
    public void postConstruct() {
        if (redisUtils!=null) {
            System.out.println("redis port: "
                    + redisUtils.getPort());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringStarter02Application.class, args);
    }

}
