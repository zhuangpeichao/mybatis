package com.bdqn.dao;

import com.bdqn.bean.Info;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoDao {
	public int sava(Info obj);//添加
	public int savaList(@Param("savaList") List<Info> list);//批量插入
	public int delateAll(@Param("delateAll") List<Info> list);//批量删除
	public int update(Info obj);//更新
	public int delete(Integer newsid);//删除
	public int deleteByType(Integer newsType);//根据类型删除
	
	public Info select(Integer newsid);//根据id查询
	public List<Info>queryBypage(@Param("pageNo")int pageNo, @Param("size") int size,@Param("typestr")  Integer typestr, @Param("keywords")  String keywords);//分页查询
	public List<Info> querAll();//查询所有
	
}
