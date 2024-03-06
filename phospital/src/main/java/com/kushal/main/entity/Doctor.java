package com.kushal.main.entity;

import javax.validation.constraints.Min;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Min(value = 1001)
	private Integer docId;
	private String docName;
	private String docSpecailization;
	private String docMobile;
	private String docEmail;
	private String docPassword;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(Integer docId, String docName, String docSpecailization, String docMobile, String docEmail,
			String docPassword) {
		super();
		this.docId = docId;
		this.docName = docName;
		this.docSpecailization = docSpecailization;
		this.docMobile = docMobile;
		this.docEmail = docEmail;
		this.docPassword = docPassword;
	}
	public Integer getDocId() {
		return docId;
	}
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocSpecailization() {
		return docSpecailization;
	}
	public void setDocSpecailization(String docSpecailization) {
		this.docSpecailization = docSpecailization;
	}
	public String getDocMobile() {
		return docMobile;
	}
	public void setDocMobile(String docMobile) {
		this.docMobile = docMobile;
	}
	public String getDocEmail() {
		return docEmail;
	}
	public void setDocEmail(String docEmail) {
		this.docEmail = docEmail;
	}
	public String getDocPassword() {
		return docPassword;
	}
	public void setDocPassword(String docPassword) {
		this.docPassword = docPassword;
	}
	
	
	

}
