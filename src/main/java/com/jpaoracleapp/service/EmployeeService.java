package com.jpaoracleapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaoracleapp.dao.EmployeeDao;
import com.jpaoracleapp.model.Employee;

@Service
public class EmployeeService {

	          
	           @Autowired
	           private EmployeeDao employeerepo;
	           
	           
	           public void saveEmployeeData() {
	        	   
	        	      Employee emp=new Employee();
	        	      emp.setName("harsha");
	        	      emp.setAddress("hydrabad");
	        	      emp.setSalary(6000);
	        	      Employee emp1=new Employee();
	        	      emp1.setName("hello");
	        	      emp1.setAddress("chennai");
	        	      emp1.setSalary(5000);
	        	      Employee emp2=new Employee();
	        	      emp2.setName("java");
	        	      emp2.setAddress("delhi");
	        	      emp2.setSalary(4000);
	        	      
	        	      List<Employee> list=new ArrayList<Employee>();
	        	      list.add(emp);
	        	      list.add(emp1);
	        	      list.add(emp2);
	        	      
	        	    	  employeerepo.saveAll(list);
	        	      
	        	      System.out.println("sucessfully saved employee data in db");
	        	      
	           }
	           
	           public void findById() {
	        	   long id=2;
	        	   Optional<Employee> op=   employeerepo.findById(id);
	        	   if(op.isPresent()) {
	        		   System.out.println(op.get());
	        	   }else {
	        		      System.out.println("record not found");   
	        	   }
	           }
	           
	         public void findAllEmployee(){
	        	 
	        	List<Employee> li= (List<Employee>) employeerepo.findAll();
	        	
	        	System.out.println(li);
	         }
	         
	         public void delete() {
	        	 
	        	 employeerepo.deleteById((long) 2);
	        	 System.out.println("sucessfully deleted");
	        	 
	         }
	        public void updateEmployeeData() {
	        	
	        	   Employee emp=new Employee();
	        	  emp.setId(1);
	        	  emp.setSalary(200000);
	        	  emp.setName("ravi");
	        	  emp.setAddress("bangalore");
	        	  employeerepo.save(emp);
	        	  System.out.println("sucessfully updated employee salary");
	        }
	        
	      
	        public void testFindByAddress() {
	        	
	        	   List<Employee> names=employeerepo.getAddressNames("hydrabad");
	        	   
	        	   names.forEach(name->{
	        	   System.out.println(name);
	        	   }
	        			          
	        			   );
	        }
	        public void testSalaryGreater() {
	        	
	        List<Employee> entiry=	employeerepo.findBySalaryGreaterThanEqual(4000);
	        
	        entiry.forEach(entity->{
	        	System.out.println(entity);
	        });
	        }
}
