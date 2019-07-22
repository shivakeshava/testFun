package com.cg.productmgmt.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.productmgmt.dto.Employee;
import com.cg.productmgmt.exception.EmployeeException;


public interface ProductDAO 
{
	public int updateProducts(String category,int hike);
	public Map<String,String> getProductDetails();



}
