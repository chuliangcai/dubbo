package com.example.provider.dubbo;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.AccountService;
import com.example.provider.dao.AccountDao;

/**
 * @author superman
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void deduct() {

    }
}
