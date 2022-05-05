package com.bdqn.dao.impl;

import com.bdqn.bean.Info;
import com.bdqn.bean.User;
import com.bdqn.dao.InfoDao;
import com.bdqn.dao.UserDao;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        //批量删除
        /*List list=new ArrayList();
        list.add(79);
        list.add(80);
        InfoDao infoDao=new InfoDaoImpl();
        infoDao.delateAll(list);*/

        //根据id查询
      /*  UserDao userDao=new UserDaoImpl();
        User user=userDao.selectById(1);*/


      /* List<User> list =userDao.querAll();
        for (User user:list) {
            System.out.println(user);
        }*/
        //登录
   /* User user=userDao.queryLogin("admin","123");
    System.out.println(user);*/


        //先查询在添加
     /*  InfoDao infoDao=new InfoDaoImpl();
        Info info=infoDao.select(20);
        int info1=infoDao.sava(info);
        System.out.println(info1);*/
//更新
     //批量插入
       InfoDao infoDao=new InfoDaoImpl();
        List<Info> list=new ArrayList<>();
/*
        Info info=new Info();
        info.setNewsTitle("123");
list.add(info);
        Info info1=new Info();
        info1.setNewsTitle("345");
list.add(info1);
infoDao.savaList(list);*/

    //分页查询
        List<Info> info=infoDao.queryBypage(0,5,1,"中文");
        Info in =infoDao.select(20);
        //删除
       // int in=infoDao.delete(72);

       /* in.setNewsContent("2222222");
        int i =infoDao.update(in);*/
    }
}
