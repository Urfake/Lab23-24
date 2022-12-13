package com.example.thirdservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ThirdServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdServiceApplication.class, args);
    }

}
