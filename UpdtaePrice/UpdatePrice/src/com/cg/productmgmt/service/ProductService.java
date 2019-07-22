package com.cg.productmgmt.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.productmgmt.dto.Employee;
import com.cg.productmgmt.exception.EmployeeException;

public interface ProductService 
{
public boolean isHikeValid(int hike);
public boolean isCategoryValid(String category);
public int updateProducts(String category,int hike);
public Map<String,Integer> getProductDetails();
}
