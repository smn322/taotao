package com.smn.it.taotaomall.sso.entity.common;

import java.io.Serializable;

public class TokenInfoVO implements Serializable {

    private static final long serialVersionUID = -475790941982L;

    private String tokenValue;
    /**
     *  token的有效持续时间单位为ms
     */
    private long effectiveTime;

    /**
     *  token绑定的用户
     */
    private  String UID;

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    public long getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(long effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public TokenInfoVO(String tokenValue, long effectiveTime, String UID) {
        this.tokenValue = tokenValue;
        this.effectiveTime = effectiveTime;
        this.UID = UID;
    }

    public TokenInfoVO() {

    }
}
