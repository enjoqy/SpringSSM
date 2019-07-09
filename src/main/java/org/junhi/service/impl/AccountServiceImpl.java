package org.junhi.service.impl;

import org.junhi.domain.Account;
import org.junhi.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author junhi
 * @date 2019/6/26 10:44
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    public List<Account> findAll() {
        System.out.println("业务层，查询所有账户。。。");
        return null;
    }

    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户。。。");

    }
}
