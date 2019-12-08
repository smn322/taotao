package com.smn.it.taotaomall.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.merchants.services.IHelloService;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;
import com.smn.it.taotaomall.sso.service.LogServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Reference(group = "hello", loadbalance = "roundrobin ")
    private IHelloService helloService;

    @Reference(check = false)
    private LogServices logServices;

    @GetMapping("/say")
    public String hello() {
        UserInfoVO userInfoVO = new UserInfoVO();
        userInfoVO.setPassword("123456");
        userInfoVO.setUserAccount("smn322");
        JSONObject login = logServices.login(userInfoVO);
        return login.toString();
    }

}
