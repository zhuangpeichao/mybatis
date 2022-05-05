package com.bdqn.dao.impl;

import com.bdqn.bean.Type;
import com.bdqn.bean.User;
import com.bdqn.dao.TypeDao;
import com.bdqn.dao.UserDao;
import com.bdqn.dao.UtilMybatis;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TypeDaoImpl implements TypeDao {
    @Override
    public List<Type> queryAll() {
        SqlSession sqlSession = UtilMybatis.getSqlSession();
        List<Type> list = sqlSession.getMapper(TypeDao.class).queryAll();
        sqlSession.close();
        return list;
    }
}
