package com.itformacion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		MyService myService = ctx.getBean("myServiceByName", MyService.class);
		int customerId = 2;
		
		try {
			System.out.println(myService.getCustomerById(customerId));
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		ctx.close();
	}
}
