package com.codegnan.service;

import java.util.List;

import com.codegnan.exceptions.InvalidUserException;
import com.codegnan.model.User;

public interface UserService {
	
	public User addUser(User user);
	public List<User> viewAllUsers();
	public User findById(Long id) throws InvalidUserException;
	public User findUserByEmail(String  email) throws InvalidUserException;
	public void deleteUserById(Long id) throws InvalidUserException;
	
}
