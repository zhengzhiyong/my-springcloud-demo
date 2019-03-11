package com.provider01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Provider01Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider01Application.class, args);
    }

}
