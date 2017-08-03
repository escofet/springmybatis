package com.itformacion;

import java.util.List;

public class MyServiceImpl implements MyService {
	private CustomerMapper customerMapper;

	public void setCustomerMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}

	public Customer getCustomerById(int customerId) {
		return this.customerMapper.getCustomer(customerId);
	}

	public List<Customer> getCustomers() {
		return customerMapper.getCustomers();
	}
}