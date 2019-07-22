package com.cg.productmgmt.ui;

import java.util.Scanner;

import com.cg.productmgmt.dto.Employee;
import com.cg.productmgmt.exception.EmployeeException;
import com.cg.productmgmt.service.IProductService;
import com.cg.productmgmt.service.ProductService;


public class Client {
	
	public static void main(String[] args)  {
		{
			IProductService ps = new IProductService();
	    	
		char choice;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int ch;
			String productCategory;
			int hikeRate;
			System.out.println(" 1-Update Product Price \n 2-Exit \n");
			ch = sc.nextInt();
			
			if(ch == 1 || ch == 2)
			{
				if(ch == 1)
				{
					System.out.println("Enter the Product Category :");
					productCategory = sc.next();
					boolean psiscv = ps.isCategoryValid(productCategory);
					if(!psiscv)
					{
						System.out.println("Product Category Not Found");
						continue;
					}
					System.out.println("Enter the Hike rate:");
					
					hikeRate = sc.nextInt();
					
						boolean hriscv = ps.isHikeValid(hikeRate);
						
						if(!hriscv)
						{
							System.out.println("Hike Rate is Not Valid");
							continue;	
						}
				int count = 	ps.updateProducts(productCategory, hikeRate);
					System.out.println("Products Updated  "+count);
					System.out.println("Product Details : "+ps.getProductDetails());
				}
				else if(ch == 2)
				{
					System.out.println("END");
					break;
				}
				
			}
			else
			{
				System.out.println("Enter Correct Choice");
				continue;
			}
		}
		


}
	}
}
