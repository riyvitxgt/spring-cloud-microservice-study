package com.zhukm.spring.cloud.comsumer.controller;

import com.zhukm.spring.cloud.comsumer.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhukm on 2017/8/24.
 */
@RestController
public class HelloController {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return helloRemote.hello(name);
    }
}
