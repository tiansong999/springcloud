package com.cloud.erueka_server01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EruekaServer01Application {

    public static void main(String[] args) {
        SpringApplication.run(EruekaServer01Application.class, args);
    }

}
