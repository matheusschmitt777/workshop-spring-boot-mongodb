package com.matheusdev.workshopmongo.dto;

import java.io.Serializable;

import com.matheusdev.workshopmongo.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String email;
	
	public UserDTO() {
	}
	
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
