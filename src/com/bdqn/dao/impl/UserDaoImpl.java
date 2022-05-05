package com.bdqn.dao.impl;

import com.bdqn.bean.User;
import com.bdqn.dao.UserDao;
import com.bdqn.dao.UtilMybatis;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public List<User> querAll() {
        SqlSession sqlSession = UtilMybatis.getSqlSession();
        List<User> list = sqlSession.getMapper(UserDao.class).querAll();
        sqlSession.close();
        return list;
    }

    @Override
    public User queryLogin(String userName, String userPwd) {

        SqlSession sqlSession = UtilMybatis.getSqlSession();
        User user = sqlSession.getMapper(UserDao.class).queryLogin(userName, userPwd);
        sqlSession.close();
        return user;
    }

    @Override
    public User selectById(Integer id) {

        SqlSession sqlSession = UtilMybatis.getSqlSession();
        User user = sqlSession.getMapper(UserDao.class).selectById(id);
        sqlSession.close();
        return user;

    }
}