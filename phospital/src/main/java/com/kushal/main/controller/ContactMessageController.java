package com.kushal.main.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kushal.main.entity.ContactMessage;
import com.kushal.main.entity.User;
import com.kushal.main.service.ContactMessageService;
@RequestMapping("/contact")
@RestController
public class ContactMessageController {
    
    @Autowired
    private ContactMessageService contactMessageService;
    
    @PostMapping("/add")
	public ResponseEntity<ContactMessage> saveQuery(@RequestBody ContactMessage contactMessage) {
		ContactMessage saved=contactMessageService.saveContactMessage(contactMessage);
		return new ResponseEntity<>(saved,HttpStatus.ACCEPTED) ;
	}
}
