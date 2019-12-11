package com.smn.it.taotaomall.sso.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.sso.dao.RegistryDao;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;
import com.smn.it.taotaomall.sso.service.RegistryServices;
import com.smn.it.taotaomall.sso.util.ResultBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = RegistryServices.class)
@Component
public class RegistryServicesImpl implements RegistryServices {
    @Autowired
    private RegistryDao registryDao;
    @Override
    public JSONObject registry(UserInfoVO userInfoVO) {
        registryDao.insertOne(userInfoVO);
        return ResultBeanUtils.buildDefaultSuccessResult();
    }
}
