package com.springsecurity.manager;

import com.springsecurity.domain.Users;


public interface UserManager {
	
	public Users createUser(String username, String password, String role);
	
	public Long deleteUser(String username);
}
