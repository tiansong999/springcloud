package com.cloud.wb_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class WbFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(WbFeignApplication.class, args);
    }

}
