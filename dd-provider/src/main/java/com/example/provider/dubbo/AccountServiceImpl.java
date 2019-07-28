package com.example.provider.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.AccountService;

/**
 * @author superman
 */
@Service
public class AccountServiceImpl implements AccountService {


    @Override
    public void deduct() {

    }
}
