package com.matheusdev.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.matheusdev.workshopmongo.entities.User;

public interface UserRepository extends MongoRepository<User, String>{

}
