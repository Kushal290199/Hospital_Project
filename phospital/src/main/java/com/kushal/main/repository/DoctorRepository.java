package com.kushal.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kushal.main.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	
	Doctor findByDocEmailAndDocPassword(String docEmail,String docPassword);

}
