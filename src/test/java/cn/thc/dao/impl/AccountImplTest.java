package cn.thc.dao.impl;

import cn.thc.SpringbootestApplication;
import cn.thc.dao.AccountDao;
import cn.thc.model.po.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by thc on 2017/2/24
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootestApplication.class)
public class AccountImplTest {

    @Autowired
    private AccountDao accountDao;

    @Test
    public void testInsertAccount() throws Exception {
        Account account = new Account();
        account.setLoginname("test1");
        account.setPassword("123456");
        account.setUpdatets(System.currentTimeMillis());
        long id = accountDao.insertAccount(account);
        System.out.println(id+"========================================");
    }

}