package com.smn.it.taotaomall.sso.service;

import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;

public interface LogServices {

    /**
     * 登录服务
     * @param userInfoVO
     * @return
     */
    JSONObject login(UserInfoVO userInfoVO);

    /**
     * 登出服务
     * @param userInfoVO
     * @return
     */
    JSONObject logout(UserInfoVO userInfoVO);
}
