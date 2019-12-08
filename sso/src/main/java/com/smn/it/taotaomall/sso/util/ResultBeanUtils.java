package com.smn.it.taotaomall.sso.util;

import com.alibaba.fastjson.JSONObject;
import com.smn.it.taotaomall.sso.api.support.ApiResultConstants;

/**
 *
 */
public final class ResultBeanUtils {

    /**
     *
     * @return
     */
    public static JSONObject buildDefaultSuccessResult(){
        JSONObject json = new JSONObject();
        json.put("code", ApiResultConstants.SUCCESS_CODE);
        json.put("msg", ApiResultConstants.SUCCESS0_MSG);
        return json;
    }

    /**
     *
     * @return
     */
    public static JSONObject buildDefaultFailedResult(){
        JSONObject json = new JSONObject();
        json.put("code", ApiResultConstants.FAILED_CODE);
        json.put("msg", ApiResultConstants.FAILED_MSG);
        return json;
    }

    /**
     *
     * @return
     */
    public static JSONObject buildReslut(){
        return new JSONObject();
    }
}
