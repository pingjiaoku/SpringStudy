package com.itheima.service;

import com.itheima.dao.AccountMapper;
import com.itheima.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @description:
 * @time: 5/11/2022 10:37
 */
@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private AddService addService;
    @Transactional(rollbackFor = Exception.class)
    public void transfer(Integer out, Integer in, Long money) throws IOException {
        try {
            accountMapper.Transfer(out, -money);
            if(true)throw new IOException();
            accountMapper.Transfer(in, money);
        } finally {
            addService.addAccount();
        }
    }
}
