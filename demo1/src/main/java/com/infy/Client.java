package com.infy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.infy.service.CustomerServiceImpl;
import com.infy.util.SpringConfiguration;

public class Client {
	public static void main(String[] args) {
		CustomerServiceImpl service = null;

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		try {
			service = (CustomerServiceImpl) context.getBean("customerServiceImpl");
			System.out.println(service.createCustomer());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			context.close();
		}
		
	}
}
