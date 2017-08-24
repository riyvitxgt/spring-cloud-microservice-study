package com.zhukm.spring.cloud.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhukm on 2017/8/24.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello2 [" + name + "] ^_^";
    }
}
