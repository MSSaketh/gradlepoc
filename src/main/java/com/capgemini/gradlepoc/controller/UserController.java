package com.capgemini.gradlepoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.gradlepoc.domain.User;
import com.capgemini.gradlepoc.repository.UserRepo;

@RestController
public class UserController {
	
	private UserRepo userRepo;

	@Autowired
	public UserController(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@PostMapping("/save")
	public ResponseEntity<?> saveUser(@RequestBody User user){
		
		return new ResponseEntity<User>(userRepo.save(user), HttpStatus.CREATED);
		
	}
	
	
	
	
	

}
