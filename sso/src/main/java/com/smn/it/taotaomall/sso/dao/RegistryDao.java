package com.smn.it.taotaomall.sso.dao;

import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 注册服务dao
 *
 * @author Administrator
 */
@Mapper
@Repository
public interface RegistryDao {
    @Insert("INSERT INTO public.\"TT_userinfo_t\"( user_account, birthday, passowrd, address, email, phone_number, " +
            " \"ID\", \"UID\") VALUES (#{userAccount,jdbcType=VARCHAR}, #{birthday,jdbcType=DATE}, #{password,jdbcType=VARCHAR}, " +
            "#{address,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{phoneNumber,jdbcType=VARCHAR}," +
            " #{id,jdbcType=VARCHAR}, #{uid,jdbcType=VARCHAR})")
    int insertOne(UserInfoVO userInfoVO);
}
