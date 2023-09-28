package com.nicholasdiego.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nicholasdiego.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
