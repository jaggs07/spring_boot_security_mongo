package com.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.domain.Users;
import com.springsecurity.manager.UserManager;
import com.springsecurity.manager.UsersRepository;


@Service
public class UserManagerImpl implements UserManager{

	
	@Autowired
	private UsersRepository userRepository;
	
	@Override
	public Users createUser(String username, String password, String role) {
		
		for (Users user : userRepository.findAll()) {
			if(user.getUsername().equalsIgnoreCase(username)){
				return null;
			}
		}
		return userRepository.save(new Users(username, password, role));	
	}

	@Override
	public Long deleteUser(String username) {
		
		return userRepository.removeByUsername(username);
	}
}
