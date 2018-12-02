package com.example.provider.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.HelloService;

/**
 * @author superman
 */
@Service
public class HelloServiceDubboImpl implements HelloService {
    @Override
    public String helloWorld() {
        return "hello world";
    }
}
