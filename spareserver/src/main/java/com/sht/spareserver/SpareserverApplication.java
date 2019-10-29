package com.sht.spareserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpareserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpareserverApplication.class, args);
    }

}
