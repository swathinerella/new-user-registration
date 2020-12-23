package com.bootcamp.loginuser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.loginuser.entity.NewUserEntity;
import com.bootcamp.loginuser.model.NewUser;
import com.bootcamp.loginuser.repo.UserRepository;

@Service
public class LoginUserService {

	@Autowired
	UserRepository userRepository;

	public String addNewUser(NewUser newUser)

	{

		NewUserEntity newUserEntity = new NewUserEntity(newUser.getFirstName(), newUser.getLastName(),
				newUser.getEmail(), newUser.getPassword());



		newUserEntity = userRepository.save(newUserEntity);
		
		return newUserEntity.getId() > 0 ? "New User Created" : "Error please try again";
		
	}

}
