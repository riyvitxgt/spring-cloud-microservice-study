package com.zhukm.spring.cloud.comsumer.hystrix;

import com.zhukm.spring.cloud.comsumer.feign.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhukm on 2017/8/24.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this message send failed";
    }
}
