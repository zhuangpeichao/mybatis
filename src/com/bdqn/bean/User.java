package com.bdqn.bean;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
public class User implements Serializable {
//类和表
//实现序列化id
//属性跟列
//对象跟行
//类间关系对应表间关系
//使用包装类
    private static final long serialVersionUID = 7197903316701612619L;
    private Integer userId;
    private String realName;
    private String userName;
    private String userPwd;
//生成无参
    public User() {
    }

    public User(Integer userId, String realName, String userName, String userPwd) {
        this.userId = userId;
        this.realName = realName;
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getRealName() {
        return realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
//重写tostring
    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }



}
