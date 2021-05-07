package com.yotta;


import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Qi Jingchao
 * @Date 2021/4/28 1:59
 * @Note Yotta监控守护程序，可用于观察Yotta系统运行情况。
 * @Caution 需要同时配置客户端以连接本守护程序。
 */

@SpringBootApplication
@EnableAdminServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
