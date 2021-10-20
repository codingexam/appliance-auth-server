package com.appliance.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appliance.auth.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{
	public User findByUsername(String username);
}
