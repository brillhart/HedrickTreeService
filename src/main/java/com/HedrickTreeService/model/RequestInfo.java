package com.HedrickTreeService.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class RequestInfo {

	@NotBlank(message="Please enter a name")
	private String name;
	
	@NotBlank(message="Please enter an email")
	@Email(message="Please enter a valid email")
	private String email;
	
	@NotBlank(message="Please enter a phone number")
	private String phone;
	
	@NotBlank(message="Please enter an address")
	private String address;
	
	@NotBlank(message="Please leave a comment")
	private String comment;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}

