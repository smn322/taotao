package com.smn.it.taotaomall.sso.util;

/**
 *
 */
public class UIDUtils {
    private static final String UID_PREFIX = "taotaomall_";

    public static String getUID(String userAccount) {
        return UID_PREFIX + userAccount;
    }
}
