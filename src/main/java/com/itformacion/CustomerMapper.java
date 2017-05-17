package com.itformacion;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CustomerMapper {
	@Select("SELECT * FROM APP.CUSTOMER WHERE CUSTOMER_ID = #{customerId}")
	Customer getCustomer(@Param("customerId") int customerId);
}
