package com.cg.productmgmt.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.cg.productmgmt.dao.IProductDAO;
import com.cg.productmgmt.dao.ProductDAO;
import com.cg.productmgmt.dto.Employee;
import com.cg.productmgmt.exception.EmployeeException;


public class IProductService implements ProductService
{
	IProductDAO PDAO = null;

	@Override
	public boolean isHikeValid(int hike) {
		if(hike < 0)
		{
			return false;
		}
		else {
		return true;}
	}

	@Override
	public boolean isCategoryValid(String category) {
		IProductDAO pdao = new IProductDAO();
		Map<String, String> salesMap= pdao.getProductDetails();
		int count = 0;
		for(String map:salesMap.values())
		{
			if(map.equalsIgnoreCase(category))
			{
				count++;
			}
		}
		if(count >0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public int updateProducts(String category, int hike) {
		IProductDAO pdao = new IProductDAO();
		Map<String, Integer> salesMap= pdao.getSalesDetails();
		Map<String, String > productMap = pdao.getProductDetails();
		

		
		int count = 0;
		for (Entry<String, String> entry2 : productMap.entrySet()) 
		{
			if(entry2.getValue().toString().equalsIgnoreCase(category))
			{
				Map<String,Integer> salesMapUpdate = new HashMap<String,Integer>();
				 for (Entry<String, Integer> entry : salesMap.entrySet()) 
				 {
					 
					 if(entry.getKey().toString().equalsIgnoreCase(entry2.getKey().toString()))
					 {
						int valueUpdate = entry.getValue()+hike;
						salesMap.put(entry.getKey(), valueUpdate);
						count++;
					 }
					 else
					 {
						 salesMap.put(entry.getKey(), entry.getValue());
					 }
				 }
			}
		}
		
		 pdao.setSalesDetails(salesMap);
		
		 
		
		return count;
	}

	@Override
	public Map<String, Integer> getProductDetails() {
		IProductDAO dao = new IProductDAO();
		Map<String, Integer> salesMap= dao.getSalesDetails();
		return salesMap;
	}
	


}