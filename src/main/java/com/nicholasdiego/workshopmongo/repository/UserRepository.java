package com.nicholasdiego.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nicholasdiego.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
