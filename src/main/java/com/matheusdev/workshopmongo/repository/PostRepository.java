package com.matheusdev.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.matheusdev.workshopmongo.entities.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
