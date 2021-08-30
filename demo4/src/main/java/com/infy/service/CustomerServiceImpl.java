package com.infy.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Value("10")
	private int count;

	public String fetchCustomer(int count) {
		return " ";
	}

	public String createCustomer() {
		return "Customer is successfully created";
	}

}
