package com.smn.it.taotaomall.sso.entity.common;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author Administrator
 */
public class UserInfoVO implements Serializable {

    private static final long serialVersionUID = -4757909419155417282L;

    private String userAccount;

    private Date birthday;

    private String password;

    private String address;

    private String email;

    private String phoneNumber;

    private String id;

    private String uid;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public UserInfoVO() {
    }

    public UserInfoVO(String userAccount, Date birthday, String password, String address, String email, String phoneNumber, String ID) {
        this.userAccount = userAccount;
        this.birthday = birthday;
        this.password = password;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = ID;
    }
}
