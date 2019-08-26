package com.cloud.erueka_server11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EruekaServer11Application {

    public static void main(String[] args) {
        SpringApplication.run(EruekaServer11Application.class, args);
    }

}
