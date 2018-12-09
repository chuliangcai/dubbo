package com.example.provider.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class UserService {

    @PostConstruct
    public void init(){

    }
    public void saveOrUpdateUser(){
        System.out.println("save or update user");
    }

    @PreDestroy
    public void destroy(){

    }
}
