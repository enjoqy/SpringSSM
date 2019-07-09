package org.junhi.service;

import org.junhi.domain.Account;

import java.util.List;

/**
 * @author junhi
 * @date 2019/6/26 10:42
 */
public interface AccountService {

    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    void saveAccount(Account account);

}
