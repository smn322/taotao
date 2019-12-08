package com.smn.it.taotaomall.merchants.servicesimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.smn.it.taotaomall.merchants.services.IHelloService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = IHelloService.class,group="hello")
public class HelloService implements IHelloService {
    @Override
    public String sayHello() {
        return "hello";
    }
}
