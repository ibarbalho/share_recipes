package com.barbalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbalho.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);
}
