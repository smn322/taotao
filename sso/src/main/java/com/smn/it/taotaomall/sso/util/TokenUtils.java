package com.smn.it.taotaomall.sso.util;

public class TokenUtils {
    private static final String TOKEN_PREFIX="token_";

    public static String getToken(String userAccount){
        return TOKEN_PREFIX+userAccount;
    }
}
