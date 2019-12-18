package com.smn.it.taotaomall.sso.controller;

import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;
import com.smn.it.taotaomall.sso.service.LogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @Autowired
    private LogServices logServices;
    @PostMapping("/log")
    public JSONObject log( @RequestBody UserInfoVO userInfoVO){
        return logServices.login(userInfoVO);
    }
}
