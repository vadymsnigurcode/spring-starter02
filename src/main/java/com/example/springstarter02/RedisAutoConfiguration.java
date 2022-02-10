package com.example.springstarter02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(RedisUtils.class)
@EnableConfigurationProperties(RedisProperties.class)
public class RedisAutoConfiguration {

    @Autowired
    private RedisProperties redisProperties;

    @Bean
    public RedisUtils redisUtils() {

        RedisUtils redisUtils = new RedisUtils();
        redisUtils.setPort(redisProperties.getPort());
        return redisUtils;
    }

}
