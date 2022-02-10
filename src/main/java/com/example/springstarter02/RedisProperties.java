package com.example.springstarter02;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

    private String host;

    private Integer port;

    private String password;

    private Integer database;

    private String sentinelNodes;

    private String clusterNodes;

    private String master;

    private Integer poolMaxActive;

    private Integer poolMaxIdle;

    private Integer poolMaxWait;

    private Integer poolMinIdle;

}
