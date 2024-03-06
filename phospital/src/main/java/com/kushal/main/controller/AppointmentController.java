package com.kushal.main.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kushal.main.entity.Appointment;
import com.kushal.main.service.AppointmentService;

@RequestMapping("/appointment")
@Controller
public class AppointmentController {
    
    @Autowired
    private AppointmentService appointmentService;
  
    
    @PostMapping("/add")
	public ResponseEntity<Appointment> saveQuery(@RequestBody Appointment appointment) {
		Appointment saved=appointmentService.saveAppointment(appointment);
		return new ResponseEntity<>(saved,HttpStatus.ACCEPTED) ;
	}
    
	
	  @GetMapping("/all") public ResponseEntity<List<Appointment>>getAllAppointments() { 
		  List<Appointment> appointments =appointmentService.getAllAppointments(); 
		  return new ResponseEntity<>(appointments, HttpStatus.OK); }
	 
    
  
}
