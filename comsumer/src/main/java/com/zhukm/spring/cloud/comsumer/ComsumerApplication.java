package com.zhukm.spring.cloud.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by zhukm on 2017/8/24.
 */
@SpringBootApplication
@EnableDiscoveryClient//启用服务注册与发现
@EnableFeignClients//启动feign进行远程调用
public class ComsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComsumerApplication.class, args);
    }
}
