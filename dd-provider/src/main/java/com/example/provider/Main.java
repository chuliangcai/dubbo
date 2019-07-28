package com.example.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author superman
 */
@SpringBootApplication
@EnableDubbo
public class Main {
    public static void main(String[] args) throws Exception {
        /*new SpringApplicationBuilder(Main.class)
                .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
                .run(args);
        System.in.read();*/
        SpringApplication.run(Main.class, args);
    }
}
