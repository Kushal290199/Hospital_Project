package com.kushal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushal.main.entity.Appointment;
import com.kushal.main.repository.AppointmentRepository;

@Service
public class AppointmentService {
    
    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

	
	  public List<Appointment> getAllAppointments() { 
		  return appointmentRepository.findAll(); }
	 
    
 
}
