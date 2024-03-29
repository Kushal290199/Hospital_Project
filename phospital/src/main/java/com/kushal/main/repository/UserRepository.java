package com.kushal.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kushal.main.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUserNameAndPassword(String userName, String password);

}
