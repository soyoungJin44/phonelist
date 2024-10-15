package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.UserService;
import com.javaex.util.JsonResult;
import com.javaex.vo.UserVo;



@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/api/users")
	public JsonResult selectList() {
		System.out.println("controller j w");
		
		List<UserVo> list = service.exeSelectList();
		System.out.println(list);
		
		return JsonResult.success(list); 
		
	}
	
}
