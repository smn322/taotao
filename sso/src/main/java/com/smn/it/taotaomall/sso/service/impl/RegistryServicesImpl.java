package com.smn.it.taotaomall.sso.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;
import com.smn.it.taotaomall.sso.service.RegistryServices;
import org.springframework.stereotype.Component;

@Service(interfaceClass = RegistryServices.class)
@Component
public class RegistryServicesImpl implements RegistryServices {
    @Override
    public JSONObject registry(UserInfoVO userInfoVO) {
        return null;
    }
}
