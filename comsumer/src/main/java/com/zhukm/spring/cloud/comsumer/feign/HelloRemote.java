package com.zhukm.spring.cloud.comsumer.feign;

import com.zhukm.spring.cloud.comsumer.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign是一个声明式web service客户端
 * Created by zhukm on 2017/8/24.
 */
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name);
}
