package com.capgemini.gradlepoc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.gradlepoc.domain.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

	
}
