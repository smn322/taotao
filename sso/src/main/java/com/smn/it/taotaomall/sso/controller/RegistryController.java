package com.smn.it.taotaomall.sso.controller;

import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;
import com.smn.it.taotaomall.sso.service.RegistryServices;
import com.smn.it.taotaomall.sso.util.UIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RegistryController {

    @Autowired
    private RegistryServices registryServices;

    @PostMapping("/user")
    public JSONObject registration (@RequestBody UserInfoVO userInfoVO){
        /**
         *  获取uid
         */
        String uid = UIDUtils.getUID(userInfoVO.getUserAccount());
        /**
         * 设置uid
         */
        userInfoVO.setUid(uid);
        JSONObject registry = registryServices.registry(userInfoVO);
        return  registry;
    }
}
