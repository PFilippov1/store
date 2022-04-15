package com.pfilippov.autoparts.shop.service;


import java.util.List;

import com.pfilippov.autoparts.shop.domain.User;

public interface UserService {
	
	User findById(Long id);
	
	User findByUsername(String username);
		
	User findByEmail(String email);
		
	void save(User user);
	
	User createUser(String username, String email,  String password, List<String> roles);

}
