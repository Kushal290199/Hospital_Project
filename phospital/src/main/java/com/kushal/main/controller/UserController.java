package com.kushal.main.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kushal.main.entity.User;
import com.kushal.main.exception.UserException;
import com.kushal.main.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@PostMapping("/add")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User usersaved=userService.addUser(user);
		return new ResponseEntity<>(usersaved,HttpStatus.ACCEPTED) ;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUserById(@PathVariable("id") Integer id) {
		
		userService.deleteUser(id);
		return "deleted successfully";
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable("id") Integer id){
		
		User updated= userService.updateUser(user, id);
		return new ResponseEntity<>(updated,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id){
		
		User user= userService.getUserById(id);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAllUserDetails(){
		
		List<User> list= userService.getAllUser();
		
		return new ResponseEntity<>(list,HttpStatus.FOUND);
		
	}
	
	

		 
}

