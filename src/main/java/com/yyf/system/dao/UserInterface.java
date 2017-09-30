package com.yyf.system.dao;

import com.yyf.system.pojo.User;

/**
 * Created by Feng on 2017/6/3.
 */
public interface UserInterface {

    /**
     * 通过用户名查询用户
     * @param userName
     * @return
     */
    User queryUserByName(String userName);

    String queryUserNameById(int userId);
    String queryStuNameById(int userId);
}
