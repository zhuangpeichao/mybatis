package com.bdqn.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
//工具类
public class UtilMybatis {
    public static SqlSessionFactory sqlSessionFactory = null;
    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
       sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=null;
        if(sqlSessionFactory!=null){
            sqlSession = sqlSessionFactory.openSession();
            return sqlSession;
        }
        return null;

    }
}
