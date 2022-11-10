package com.itheima.service;

import com.itheima.dao.AccountMapper;
import com.itheima.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @time: 5/11/2022 16:04
 */
@Service
public class AddService {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private Account acc;
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addAccount() {
        acc.setName("dongadong");
        acc.setMoney(12345L);
        accountMapper.AddAccount(acc);
    }
}
