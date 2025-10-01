package com.lession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableEurekaClient
@EnableConfigServer
public class ConfigCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApp.class, args);
    }
}
