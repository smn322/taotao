package com.smn.it.taotaomall.sso.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.sso.config.redis.RedisConfig;
import com.smn.it.taotaomall.sso.dao.LogDao;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;
import com.smn.it.taotaomall.sso.service.LogServices;
import com.smn.it.taotaomall.sso.util.ResultBeanUtils;
import com.smn.it.taotaomall.sso.util.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service(interfaceClass = LogServices.class)
@Component
public class LogServicesImpl implements LogServices {

    @Autowired
    private LogDao logDao;

    @Autowired
    private RedisConfig redisConfig;
    @Override
    public JSONObject login(UserInfoVO userInfoVO) {
        String uid = null;
        if((uid=logDao.login(userInfoVO))!= null)
        {
            String token = TokenUtils.getToken(userInfoVO.getUserAccount());
            boolean absent = redisConfig.putTokenIfAbsent(token, uid, TokenUtils.DEAFAULT_TOKEN_EXPIRED_TIME);
            if(absent)
            {
                JSONObject data = new JSONObject();
                data.put("token",token);
                data.put("uid",uid);
                JSONObject result = ResultBeanUtils.buildDefaultSuccessResult();
                result.put("data", data);
                return result;
            }
        }
        return ResultBeanUtils.buildDefaultFailedResult();
    }

    @Override
    public JSONObject logout(UserInfoVO userInfoVO) {
        return null;
    }
}
