package com.example.provider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * @author superman
 */
@SpringBootApplication
@EnableDubbo
public class Main {
    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(Main.class).web(WebApplicationType.NONE).run(args);
        System.in.read();
    }
}
