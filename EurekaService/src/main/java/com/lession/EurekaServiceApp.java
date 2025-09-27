package com.lession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 排除连接数据源，未连接数据库
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
// 启动Eureka 服务器
@EnableEurekaServer
public class EurekaServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApp.class, args);
    }
}
