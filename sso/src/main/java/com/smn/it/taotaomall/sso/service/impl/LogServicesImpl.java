package com.smn.it.taotaomall.sso.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.sso.dao.LogDao;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;
import com.smn.it.taotaomall.sso.service.LogServices;
import com.smn.it.taotaomall.sso.util.ResultBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = LogServices.class)
@Component
public class LogServicesImpl implements LogServices {

    @Autowired
    private LogDao logDao;

    @Override
    public JSONObject login(UserInfoVO userInfoVO) {
        if(logDao.log(userInfoVO) == 1)
        {
            return ResultBeanUtils.buildDefaultSuccessResult();
        }
        return ResultBeanUtils.buildDefaultFailedResult();
    }

    @Override
    public JSONObject logout(UserInfoVO userInfoVO) {
        return null;
    }
}
