package com.cg.productmgmt.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.productmgmt.dto.Employee;
import com.cg.productmgmt.exception.EmployeeException;

/**
 * class to perform business logic
 */
public class IProductDAO implements ProductDAO{
	
	private static Map<String,String> productDetails;
	private static Map<String,Integer> salesDetails;



	@Override
	public int updateProducts(String category, int hike) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, String> getProductDetails() {
		// TODO Auto-generated method stub
		return productDetails;
	}

	public static Map<String, Integer> getSalesDetails() {
		return salesDetails;
	}

	public static void setSalesDetails(Map<String, Integer> salesDetails) {
		
		IProductDAO.salesDetails = salesDetails;
	}

	public static void setProductDetails(Map<String, String> productDetails) {
		IProductDAO.productDetails = productDetails;
	}
	
	static {
		productDetails = new HashMap<>();
		productDetails.put("lux", "soap");
		productDetails.put("colgate", "paste");
		productDetails.put("pears", "soap");
		productDetails.put("sony", "electronics");
		productDetails.put("samsung", "electronics");
		productDetails.put("facepack", "cosmatics");
		productDetails.put("facecream", "cosmatics");
		
		salesDetails = new HashMap<>();
		salesDetails.put("lux", 100);
		salesDetails.put("colgate", 50);
		salesDetails.put("pears", 70);
		salesDetails.put("sony", 10000);
		salesDetails.put("samsung", 23000);
		salesDetails.put("facepack", 100);
		salesDetails.put("facecream", 60);
	}
	
}