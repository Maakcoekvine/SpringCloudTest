package com.lession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableEurekaClient
public class ServiceThreeApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceThreeApp.class, args);
    }


    // 通过Service Three to call other service
    // @Bean 在 springboot 启动时会自动将对象交给容器去管理
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
