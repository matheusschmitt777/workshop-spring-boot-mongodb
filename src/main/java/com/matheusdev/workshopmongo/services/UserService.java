package com.matheusdev.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusdev.workshopmongo.dto.UserDTO;
import com.matheusdev.workshopmongo.entities.User;
import com.matheusdev.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<UserDTO> findAll(){
		List<User> result = repository.findAll();
		return result.stream().map(UserDTO::new).toList();
	} 
}
