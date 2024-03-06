package com.kushal.main.service;

import java.util.List;

import com.kushal.main.entity.User;
import com.kushal.main.exception.UserException;

public interface UserService {
	
	User addUser(User user) throws UserException;
	String deleteUser(Integer id)throws UserException;
	User updateUser(User user,Integer id)throws UserException;
	User getUserById(Integer id)throws UserException;
	List<User> getAllUser() throws UserException;
	User loginIdAndPassword(String userName,String password)throws UserException;

}
