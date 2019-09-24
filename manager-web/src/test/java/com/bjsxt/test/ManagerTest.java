package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:
 * @Date: 2019/9/23
 * @Description: com.bjsxt.test
 * @version:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersmapper;

    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserAge(20);
        users.setUserName("admin");
        this.usersmapper.insertUser(users);
    }
}
