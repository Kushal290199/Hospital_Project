package com.kushal.main.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kushal.main.entity.Doctor;
import com.kushal.main.service.DoctorService;


@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/add")
	public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor doctor) {
		Doctor saveDoctor=doctorService.addDoctor(doctor);
		return new ResponseEntity<>(saveDoctor,HttpStatus.ACCEPTED) ;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDoctorById(@PathVariable("id") Integer id) {
		
		doctorService.deleteDoctor(id);
		return "deleted successfully";
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Doctor> updateDoctor(@RequestBody Doctor doctor,@PathVariable("id") Integer id){
		
		Doctor updated= doctorService.updateDoctor(doctor, id);
		return new ResponseEntity<>(updated,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Doctor> getDoctorById(@PathVariable("id") Integer id){
		
		Doctor updated= doctorService.getDoctorById(id);
		return new ResponseEntity<>(updated,HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Doctor>> getAllDoctorDetails(){
		
		List<Doctor> list= doctorService.getAllDoctors();
		
		return new ResponseEntity<>(list,HttpStatus.FOUND);
		
	}	 
}

