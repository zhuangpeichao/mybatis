package com.bdqn.dao;

import com.bdqn.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //查询所有
    public List<User> querAll();
    //登录
    public User queryLogin(@Param("userName") String userName,@Param("userPwd") String userPwd);
    public User selectById(Integer id);
}
