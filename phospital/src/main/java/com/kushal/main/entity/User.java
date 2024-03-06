package com.kushal.main.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String userName;
    private String name;
    private String mobile;
    private String email;
    private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String userName, String name, String mobile, String email, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", name=" + name + ", mobile=" + mobile + ", email="
				+ email + ", password=" + password + "]";
	}
    
	
    
    
	  
    
}
