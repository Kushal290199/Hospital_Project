package com.kushal.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushal.main.entity.User;
import com.kushal.main.exception.UserException;
import com.kushal.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) throws UserException {
	User adduser =userRepository.save(user);
	return adduser;
	}

	@Override
	public String deleteUser(Integer id) throws UserException {
		userRepository.deleteById(id);
		return "deleted successfully";
	}

	@Override
	public User updateUser(User user, Integer id) throws UserException {
		Optional<User> opt= userRepository.findById(id);
		User existingUser=opt.get();
		existingUser.setEmail(user.getEmail());
		existingUser.setMobile(user.getMobile());
		existingUser.setName(user.getName());
		existingUser.setUserName(user.getUserName());
		
		return userRepository.save(existingUser);
	}

	@Override
	public User getUserById(Integer id) throws UserException {
		Optional<User> opt= userRepository.findById(id);
		User existingUser=opt.get();
		return existingUser;
	}

	@Override
	public List<User> getAllUser() throws UserException {
		List<User> list=userRepository.findAll();
		if(list.size()==0) {
			throw new UserException("list is empty");
		}
	 return	list;
	}

	@Override
	public User loginIdAndPassword(String userName, String password) throws UserException {
		User user= userRepository.findByUserNameAndPassword(userName, password);
		if(user==null) {
			throw new UserException("Bad Credentials");
		}
		return user;
	}

}
