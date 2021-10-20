package com.appliance.auth.service;

import java.util.List;
import java.util.Optional;

import com.appliance.auth.entity.User;

public interface UserService {
	public Optional<User> getSingleUser(long userId);
	public User getByUsername(String username);
	public List<User> getAllUsers();
	public User addUser(User user) throws Exception;
	public User updateUser(User user);
}
