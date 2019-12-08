package com.smn.it.taotaomall.sso.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;
import com.smn.it.taotaomall.sso.service.LogServices;
import org.springframework.stereotype.Component;

@Service(interfaceClass = LogServices.class)
@Component
public class LogServicesImpl implements LogServices {
    @Override
    public JSONObject login(UserInfoVO userInfoVO) {
        return null;
    }

    @Override
    public JSONObject logout(UserInfoVO userInfoVO) {
        return null;
    }
}
