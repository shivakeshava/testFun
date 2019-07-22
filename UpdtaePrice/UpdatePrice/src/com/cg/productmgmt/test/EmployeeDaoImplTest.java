package com.cg.productmgmt.test;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;

import com.cg.productmgmt.dao.IProductDAO;
import com.cg.productmgmt.dto.Employee;



public class EmployeeDaoImplTest {
	
	@Test
	public void daoTest() {
		Employee e=new Employee(1, "Roshni",30000);
		HashMap<Integer,Employee> map=new HashMap<Integer, Employee>();
		IProductDAO daobj=new IProductDAO();
		map.put(1, e);
		Employee expected=map.get(1);
		Employee actual=map.get(e.getEmpId());
		 assertEquals(expected,actual);
		
		
		
		
	
		
	
		
	}
	
	
		
	}
	

	



	

