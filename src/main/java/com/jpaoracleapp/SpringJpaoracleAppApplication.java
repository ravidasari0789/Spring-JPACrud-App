package com.jpaoracleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpaoracleapp.service.EmployeeService;

@SpringBootApplication
public class SpringJpaoracleAppApplication {

	public static void main(String[] args) {
	  ConfigurableApplicationContext ctx=	SpringApplication.run(SpringJpaoracleAppApplication.class, args);
	  
	   
	  EmployeeService employeeService=(EmployeeService)ctx.getBean(EmployeeService.class);
	  ///employeeService.saveEmployeeData();
	 // employeeService.findAllEmployee();
	// employeeService.delete();
	  //employeeService.updateEmployeeData();
	  
	 // employeeService.testFindByAddress();
	  //employeeService.testSalaryGreater();
	  
	 // employeeService.updateBySalary();
	  employeeService.deleteByUserId();
	}

}
