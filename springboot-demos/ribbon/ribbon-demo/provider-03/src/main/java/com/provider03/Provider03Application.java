package com.provider03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Provider03Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider03Application.class, args);
    }

}
