package com.smn.it.taotaomall.sso.service;

import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;

/**
 * @author Administrator
 */
public interface RegistryServices {

    /**
     * 注册服务
     * @param userInfoVO
     * @return
     */
    JSONObject registry(UserInfoVO userInfoVO);
}
