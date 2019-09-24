package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:
 * @Date: 2019/9/23
 * @Description: com.bjsxt.service.impl
 * @version:
 */
@Service
public class UsersServiceImpl implements IUsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void addUsers(Users users){
        this.usersMapper.insertUser(users);
    }
}
