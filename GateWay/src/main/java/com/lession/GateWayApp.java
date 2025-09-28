package com.lession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // start open feign
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableEurekaClient
public class GateWayApp {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApp.class, args);
    }
}
