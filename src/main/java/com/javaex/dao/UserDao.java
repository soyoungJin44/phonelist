package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<UserVo> selectList() {
		System.out.println("select dao j w");
		
		List<UserVo> list = sqlSession.selectList("user.userList");
		
		return list;
		
		
	}
	
}
