package com.bootcamp.loginuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.loginuser.model.NewUser;
import com.bootcamp.loginuser.service.LoginUserService;

@RestController
public class LoginUserController {
	@Autowired
	LoginUserService loginUserService;
	
	@GetMapping("/logininfo")
	public String getLoginInfo()
	{
		return "Hey I'm loggin";
	}

	@PostMapping("/newuser")
	public String addNewUser(@RequestBody NewUser newUser)
	{
		return loginUserService.addNewUser(newUser);
	}
	
}
