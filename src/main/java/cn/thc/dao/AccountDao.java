package cn.thc.dao;

import cn.thc.model.po.Account;

import java.util.List;

/**
 * Created by thc on 2017/2/24
 */
public interface AccountDao {
    long insertAccount(Account account);
    void delAccount();
    void updateAccount();
    Account selectOne();
    List<Account> selectList();
}
