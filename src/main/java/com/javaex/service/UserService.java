package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public List<UserVo> exeSelectList() {
		System.out.println("exeSelectList j w");
		
		
		List<UserVo> list = dao.selectList();
		
		return list;
	}
	
}
