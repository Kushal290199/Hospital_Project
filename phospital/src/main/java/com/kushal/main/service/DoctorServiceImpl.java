package com.kushal.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushal.main.entity.Doctor;
import com.kushal.main.exception.DoctorException;
import com.kushal.main.exception.UserException;
import com.kushal.main.repository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public Doctor addDoctor(Doctor doctor) throws DoctorException {
		Doctor adddoctor=doctorRepository.save(doctor);
		return adddoctor;
	}

	@Override
	public String deleteDoctor(Integer id) throws DoctorException {
		doctorRepository.deleteById(id);
		return "deleted successfully";
	}

	@Override
	public Doctor updateDoctor(Doctor doctor, Integer id) throws DoctorException {
		Optional<Doctor> opt= doctorRepository.findById(id);
		Doctor existingDoctor=opt.get();
		existingDoctor.setDocEmail(doctor.getDocEmail());
		existingDoctor.setDocMobile(doctor.getDocMobile());
		existingDoctor.setDocName(doctor.getDocName());
		existingDoctor.setDocSpecailization(doctor.getDocSpecailization());
		existingDoctor.setDocPassword(doctor.getDocPassword());
		
		return doctorRepository.save(existingDoctor);
	}

	@Override
	public Doctor getDoctorById(Integer id) throws DoctorException {
		Optional<Doctor> opt= doctorRepository.findById(id);
		Doctor existingDoctor=opt.get();
		return existingDoctor;
	}

	@Override
	public List<Doctor> getAllDoctors() throws DoctorException {
		List<Doctor> list=doctorRepository.findAll();
		if(list.size()==0) {
			throw new UserException("list is empty");
		}
	 return	list;
	}
	
	@Override
	public Doctor loginIdAndPassword(String docEmail, String docPassword) throws DoctorException {
		Doctor doctor= doctorRepository.findByDocEmailAndDocPassword(docEmail, docPassword);
		if(doctor==null) {
			throw new DoctorException("Bad Credentials");
		}
		return doctor;	
	}

}
