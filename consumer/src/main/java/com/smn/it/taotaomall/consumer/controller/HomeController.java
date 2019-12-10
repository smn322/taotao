package com.smn.it.taotaomall.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;
import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.merchants.services.IHelloService;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;
import com.smn.it.taotaomall.sso.service.LogServices;
import com.smn.it.taotaomall.sso.service.RegistryServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Reference(group = "hello", loadbalance = RoundRobinLoadBalance.NAME)
    private IHelloService helloService;

    @Reference
    private RegistryServices registryServices;
    @Reference(check = false)
    private LogServices logServices;

    public HomeController() {
    }

    @GetMapping("/say")
    public String hello() {
        UserInfoVO userInfoVO = new UserInfoVO();
        userInfoVO.setPassword("123456");
        userInfoVO.setUserAccount("smn322");
        JSONObject login = logServices.login(userInfoVO);
        return login.toString();
    }

    @GetMapping("/user")
    public  String  addOne()
    {
        JSONObject registry = registryServices.registry(new UserInfoVO());

        return registry.toString();
    }

}
