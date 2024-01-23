package com.barbalho.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barbalho.model.User;
import com.barbalho.repository.UserRepository;



@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) throws Exception {
		
		User isExist = userRepository.findByEmail(user.getEmail());
		
		if(isExist != null) {
			throw new Exception("Email already registered "+user.getEmail());
		}
		
		User saveUser = userRepository.save(user);
		
		return saveUser;
	}
	
	@DeleteMapping("/users/{userId}")
	public String DeleteUser(@PathVariable Long userId) throws Exception {
		//TODO: improve condition, use the same idea at RecipeService
		Optional<User> id = userRepository.findById(userId);
		
		if(id.isPresent()) {
			userRepository.deleteById(userId);
			return "User deleted successfully";
		}
		throw new Exception("User not found!");
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){		
		List<User> users = userRepository.findAll();
		return users;
	}
	

}
