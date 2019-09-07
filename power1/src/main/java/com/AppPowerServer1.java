package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppPowerServer1 {

    public static void main(String[] args) {
        SpringApplication.run(AppPowerServer1.class);
    }
}
