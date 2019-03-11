package com.feign.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignProvider01Application {

    public static void main(String[] args) {
        SpringApplication.run(FeignProvider01Application.class, args);
    }

}
