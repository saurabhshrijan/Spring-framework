package com.infy.service;

public class Address {

	String city;
	String pincode;
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(String city) {
		this.city=city;
	}
}
