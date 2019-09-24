package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @Author:
 * @Date: 2019/9/23
 * @Description: com.bjsxt.mapper
 * @version:
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
