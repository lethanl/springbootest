package cn.thc.dao.impl;

import cn.thc.dao.AccountDao;
import cn.thc.model.po.Account;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by thc on 2017/2/24
 */
@Repository
public class AccountImpl implements AccountDao {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public long insertAccount(Account account) {
        sqlSessionTemplate.insert("cn.thc.dao.AccountDao.insertAccount",account);
        return account.getId();
    }

    @Override
    public void delAccount() {

    }

    @Override
    public void updateAccount() {

    }

    @Override
    public Account selectOne() {
        return null;
    }

    @Override
    public List<Account> selectList() {
        return null;
    }
}
