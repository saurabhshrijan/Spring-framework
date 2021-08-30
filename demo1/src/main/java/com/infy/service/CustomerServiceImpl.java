package com.infy.service;

public class CustomerServiceImpl implements CustomerService {
	
	private Address add;
	
	public CustomerServiceImpl(Address add) {
		this.add=add;
	}
	public Address getAddress() {
		return this.add;
	}

	public String createCustomer() {
		return "Customer is successfully created";
	}

}
