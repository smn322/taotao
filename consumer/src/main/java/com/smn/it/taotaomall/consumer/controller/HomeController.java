package com.smn.it.taotaomall.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.smn.it.taotaomall.merchants.services.IHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Reference(group="hello",loadbalance = "roundrobin ")
    IHelloService helloService;

    @GetMapping("/say")
    public String hello()
    {
        return helloService.sayHello();
    }
}
