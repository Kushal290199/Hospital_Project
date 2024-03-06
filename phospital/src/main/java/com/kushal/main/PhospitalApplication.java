package com.kushal.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@EnableSpringDataWebSupport
@SpringBootApplication
public class PhospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhospitalApplication.class, args);
	}

}
