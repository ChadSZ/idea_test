package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:
 * @Date: 2019/9/23
 * @Description: com.bjsxt.web.controller
 * @version:
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private IUsersService usersService;

    @RequestMapping("/addUsers")
    public String addUser(Users users){
        this.usersService.addUsers(users);
        return "ok";
    }
}
