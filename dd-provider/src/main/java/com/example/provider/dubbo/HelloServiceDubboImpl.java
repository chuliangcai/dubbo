package com.example.provider.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.HelloService;
import com.example.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

/**
 * @author superman
 */
@Service
public class HelloServiceDubboImpl implements HelloService {

    @Autowired
    private UserService userService;

    @Override
    public String helloWorld() {
        return "hello world";
    }

    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent event) {
        System.out.println("context refresh");
    }
}
