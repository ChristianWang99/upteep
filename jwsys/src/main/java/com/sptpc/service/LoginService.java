package com.sptpc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.domain.Userlogin;
import com.sptpc.persistence.UserLoginMapper;

@Service
public class LoginService {
	@Autowired
	private UserLoginMapper userLoginMapper;
	
	public Userlogin getUserByNameAndPwd(String name,String pwd){
		Userlogin ul = new Userlogin();
		ul.setUserName(name);
		ul.setPassword(pwd);
		return userLoginMapper.getUserLogin(ul);
	}
}
