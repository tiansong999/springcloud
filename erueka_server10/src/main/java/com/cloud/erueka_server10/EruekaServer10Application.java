package com.cloud.erueka_server10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EruekaServer10Application {

    public static void main(String[] args) {
        SpringApplication.run(EruekaServer10Application.class, args);
    }

}
