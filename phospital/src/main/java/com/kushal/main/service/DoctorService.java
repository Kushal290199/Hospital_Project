package com.kushal.main.service;

import java.util.List;

import com.kushal.main.entity.Doctor;
import com.kushal.main.exception.DoctorException;

public interface DoctorService {
	
	Doctor addDoctor(Doctor doctor) throws DoctorException;
	String deleteDoctor(Integer id)throws DoctorException;
	Doctor updateDoctor(Doctor doctor,Integer id)throws DoctorException;
	Doctor getDoctorById(Integer id)throws DoctorException;
	List<Doctor> getAllDoctors() throws DoctorException;
	Doctor loginIdAndPassword(String docEmail,String docPassword)throws DoctorException;
	

}
