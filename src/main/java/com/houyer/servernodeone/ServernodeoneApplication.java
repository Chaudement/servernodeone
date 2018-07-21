package com.houyer.servernodeone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServernodeoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServernodeoneApplication.class, args);
    }
}
