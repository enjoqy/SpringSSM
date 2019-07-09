package org.junhi.dao;

import org.junhi.domain.Account;

import java.util.List;

/**
 * 账户接口
 * @author junhi
 * @date 2019/6/26 10:39
 */
public interface AccountDao {

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
