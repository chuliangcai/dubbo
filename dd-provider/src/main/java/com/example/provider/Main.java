package com.example.provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author superman
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.example.provider.dubbo")
public class Main {
    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(Main.class)
                .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
                .run(args);
        System.in.read();
    }
}
