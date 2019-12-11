package com.smn.it.taotaomall.sso.dao;

import com.smn.it.taotaomall.sso.entity.common.UserInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 用户登录登出
 */
@Repository
@Mapper
public interface LogDao {
    @Select("SELECT count(1) as count  FROM public.\"TT_userinfo_t\" where user_account = #{userAccount} and passowrd=#{password}")
    int login(UserInfoVO userInfoVO);
}
