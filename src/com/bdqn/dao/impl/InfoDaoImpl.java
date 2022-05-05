package com.bdqn.dao.impl;

import com.bdqn.bean.Info;
import com.bdqn.bean.User;
import com.bdqn.dao.InfoDao;
import com.bdqn.dao.UserDao;
import com.bdqn.dao.UtilMybatis;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class InfoDaoImpl implements InfoDao {
    @Override
    public int sava(Info obj) {
        SqlSession sqlSession = UtilMybatis.getSqlSession();
        int obj1 = sqlSession.getMapper(InfoDao.class).sava(obj);
        sqlSession.commit();
        sqlSession.close();
        return obj1;

    }
//批量插入
    @Override
    public int savaList(List<Info> list) {
        SqlSession sqlSession = UtilMybatis.getSqlSession();
        int obj = sqlSession.getMapper(InfoDao.class).savaList(list);
        sqlSession.commit();
        sqlSession.close();
        return obj;
    }

    @Override
    public int delateAll(List<Info> list) {
        SqlSession sqlSession = UtilMybatis.getSqlSession();
        int obj = sqlSession.getMapper(InfoDao.class).delateAll(list);
        sqlSession.commit();
        sqlSession.close();
        return obj;
    }

    @Override
    public int update(Info obj) {
        SqlSession sqlSession = UtilMybatis.getSqlSession();
        int obj1 = sqlSession.getMapper(InfoDao.class).update(obj);
        sqlSession.commit();
        sqlSession.close();
        return obj1;
    }

    @Override
    public int delete(Integer newsid) {
        SqlSession sqlSession = UtilMybatis.getSqlSession();
        int obj1 = sqlSession.getMapper(InfoDao.class).delete(newsid);
        sqlSession.commit();
        sqlSession.close();
        return obj1;
    }

    @Override
    public int deleteByType(Integer newsType) {
        return 0;
    }

    @Override
    public Info select(Integer newsid) {

        SqlSession sqlSession = UtilMybatis.getSqlSession();
        Info info = sqlSession.getMapper(InfoDao.class).select(newsid);
        sqlSession.close();
        return info;

    }

    @Override
    public List<Info> queryBypage( int pageNo, int size,Integer typestr,String keywords) {

        SqlSession sqlSession = UtilMybatis.getSqlSession();
        List<Info> objlist = sqlSession.getMapper(InfoDao.class).queryBypage(pageNo,size,typestr,keywords);
        sqlSession.close();
        return objlist;
    }


    @Override
    public List<Info> querAll() {
        return null;
    }
}
