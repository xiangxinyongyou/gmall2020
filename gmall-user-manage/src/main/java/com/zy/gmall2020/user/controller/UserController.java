package com.zy.gmall2020.user.controller;


import com.zy.gmall2020.user.bean.UserInfo;
import com.zy.gmall2020.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //查询素有
    @GetMapping("allusers")
    public List<UserInfo> getAllUsers() {
        return userService.getUserInfoListAll();
    }


    //添加数据
    @PostMapping("addUser")
    public String addUser(UserInfo userInfo) {
        userService.addUser(userInfo);
        return "success";
    }

    //更新数据
    @PostMapping("updateUser")
    public String updateUser(UserInfo userInfo) {
        userService.updateUser(userInfo);
        return "success";
    }

    @PostMapping("updateUserByName")
    public String updateUserByName(UserInfo userInfo) {
        userService.updateUserByName(userInfo.getName(), userInfo);
        return "success";
    }

    @PostMapping("delUser")
    public String delUser(UserInfo userInfo){
        userService.delUser(userInfo);
        return "success";
    }


    @GetMapping("getUser")
    public UserInfo getUser(String id){
        return userService.getUserInfoById(id);

    }


}
