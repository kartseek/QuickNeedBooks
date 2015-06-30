package com.encierro.server.customer.model;

public class ENCCustomerModel {

	//Credientials
	private String customerId;
	private String password;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String email;
	
	//Address
	private String lane1;
	private String lane2;
	private String city;
	private String state;
	private String country;
	private String contact;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLane1() {
		return lane1;
	}
	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}
	public String getLane2() {
		return lane2;
	}
	public void setLane2(String lane2) {
		this.lane2 = lane2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public ENCCustomerModel(String customerId, String password,
			String firstName, String lastName, String dateOfBirth,
			String email, String lane1, String lane2, String city,
			String state, String country, String contact) {
		super();
		this.customerId = customerId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.lane1 = lane1;
		this.lane2 = lane2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.contact = contact;
	}
	
	
}
