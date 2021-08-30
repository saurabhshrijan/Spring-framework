package com.infy.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.service.Address;
import com.infy.service.CustomerServiceImpl;


public class SpringConfiguration {
	
	@Bean
	public CustomerServiceImpl customerServiceImpl() {

		return new CustomerServiceImpl(getAddress());	
	}
	
	@Bean
	public Address getAddress() {
		Address address = new Address("abcd");
		address.setPincode("52145");
		return address;
	}
}
