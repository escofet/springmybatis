package com.itformacion;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CustomerMapper {
	@Select("SELECT * FROM APP.CUSTOMER WHERE CUSTOMER_ID = #{customerId}")
	Customer getCustomer(@Param("customerId") int customerId);
	
	@Select("SELECT * FROM APP.CUSTOMER")
	List<Customer> getCustomers();
}
