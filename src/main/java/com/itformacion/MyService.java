package com.itformacion;

import java.util.List;

public interface MyService {
	public void setCustomerMapper(CustomerMapper customerMapper);
	public Customer getCustomerById(int customerId);
	public List<Customer> getCustomers();
}
