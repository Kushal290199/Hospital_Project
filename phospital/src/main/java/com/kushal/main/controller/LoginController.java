package com.kushal.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kushal.main.entity.Doctor;
import com.kushal.main.entity.User;
import com.kushal.main.service.DoctorService;
import com.kushal.main.service.UserService;

@RestController
public class LoginController {
	
	@Autowired 
	UserService userService;
	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/user/login/{userName}/{password}")
	public ResponseEntity<User> login(@PathVariable ( "userName") String userName,@PathVariable ("password") String password){
		User user=userService.loginIdAndPassword(userName, password);
		return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/doctor/login/{docEmail}/{docPassword}")
	public ResponseEntity<Doctor> doclogin(@PathVariable ( "docEmail") String docEmail,@PathVariable ("docPassword") String docPassword){
		Doctor doctor=doctorService.loginIdAndPassword(docEmail, docPassword);
		return new ResponseEntity<>(doctor,HttpStatus.ACCEPTED);
		
	}
	

}
