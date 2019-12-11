package com.smn.it.taotaomall.sso;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.smn.it.taotaomall.sso.config.redis.RedisConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.UUID;

@SpringBootApplication
@EnableDubboConfiguration
@MapperScan(basePackages="com.smn.it.taotaomall.sso.dao")
@EnableTransactionManagement
public class SsoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SsoApplication.class, args);
        RedisConfig redisConfig= run.getBean(RedisConfig.class);
        redisConfig.putTokenIfAbsent("smn322", UUID.randomUUID().toString(),100000);

    }
}
