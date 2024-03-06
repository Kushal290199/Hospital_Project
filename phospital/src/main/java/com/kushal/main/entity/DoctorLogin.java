package com.kushal.main.entity;

public class DoctorLogin {
	
	private String docEmail;
	private String docPassword;
	
	public DoctorLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoctorLogin(String docEmail, String docPassword) {
		super();
		this.docEmail = docEmail;
		this.docPassword = docPassword;
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
