package com.zy.gmall2020.user.service;

import com.zy.gmall2020.user.bean.UserInfo;

import java.util.List;

/**
 * @author zy
 * @create 2020-01-29 13:11
 */
public interface UserService {
    List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name, UserInfo userInfo);

    void delUser(UserInfo userInfo);

    UserInfo getUserInfoById(String id);
}
