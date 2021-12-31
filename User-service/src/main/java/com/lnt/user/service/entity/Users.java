package com.lnt.user.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users extends HotalBase{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2676143225306971651L;
	
	@Column(name = "fast_name")
	private String fastName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "location")
	private String location;
	@Column(name = "phone_number")
	private int phoneNumber;
	public Users(String fastName, String lastName, String email, String location, int phoneNumber) {
		super();
		this.fastName = fastName;
		this.lastName = lastName;
		this.email = email;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Users [fastName=" + fastName + ", lastName=" + lastName + ", email=" + email + ", location=" + location
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	public String getFastName() {
		return fastName;
	}
	public void setFastName(String fastName) {
		this.fastName = fastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
