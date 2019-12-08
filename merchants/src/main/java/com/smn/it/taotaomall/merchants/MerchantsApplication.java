package com.smn.it.taotaomall.merchants;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class MerchantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerchantsApplication.class, args);
    }

}
