package com.springsecurity.manager;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springsecurity.domain.Users;


public interface UsersRepository extends MongoRepository<Users, String>{
	
	public Users findByUsername(String username);
	
	public Long removeByUsername(String username);
}
