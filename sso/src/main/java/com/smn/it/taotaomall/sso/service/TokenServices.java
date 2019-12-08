package com.smn.it.taotaomall.sso.service;

import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.sso.entity.common.TokenInfoVO;
import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;

public interface TokenServices {

    /**
     *  验证token的合法性
     * @param tokenInfoVO
     * @return
     */
    JSONObject validToken(TokenInfoVO tokenInfoVO);

    /**
     *  生成token
     * @param userInfoVO
     * @return
     */
    JSONObject getToken(UserInfoVO userInfoVO);

    /**
     * 删除token
     * @param tokenInfoVO
     * @return
     */
    JSONObject deleteToken(TokenInfoVO tokenInfoVO);

}
