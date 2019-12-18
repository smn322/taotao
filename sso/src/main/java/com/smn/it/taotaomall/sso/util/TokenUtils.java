package com.smn.it.taotaomall.sso.util;

public class TokenUtils {
    private static final String TOKEN_PREFIX="token_";

    public static final long DEAFAULT_TOKEN_EXPIRED_TIME=300000;

    public static String getToken(String userAccount){
        return TOKEN_PREFIX+userAccount+System.currentTimeMillis();
    }
}
