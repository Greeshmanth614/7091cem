package com.example.webdev.bean;

public class RegisterEntity {
	
	private String Email;
	private String Password;
	private String Name;
	private String Number;
	
	public RegisterEntity() {
	}
	
	public RegisterEntity(String email, String password, String name, String number) {
		super();
		Email = email;
		Password = password;
		Name = name;
		Number = number;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}
	
	
	
	
	

}
