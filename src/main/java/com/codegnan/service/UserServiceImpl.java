package com.codegnan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegnan.exceptions.InvalidUserException;
import com.codegnan.model.User;
import com.codegnan.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repo;
	
	
	@Override
	public User addUser(User user) {
		return repo.save(user);
	}

	
	@Override
	public List<User> viewAllUsers() {
		return repo.findAll();
	}
	
	
	@Override
	public User findById(Long id) throws InvalidUserException {
		User user  = repo.findById(id).orElse(null);
		if(user != null) {
			return user;
		}else {
			throw new InvalidUserException("User not found with id : "+id);
		}
	}
	

	@Override
	public User findUserByEmail(String email) throws InvalidUserException {
		User user = repo.findByEmail(email);
		if(user != null) {
			return user;
		}else {
			throw new InvalidUserException("User not found with email : "+email);
		}
	}

	
	@Override
	public void deleteUserById(Long id) throws InvalidUserException {
		User user = repo.findById(id).orElse(null);
		if(user != null) {
			repo.delete(user);
		}else {
			throw new InvalidUserException("User not found to delete with id: "+id);
		}
	}
	

}
