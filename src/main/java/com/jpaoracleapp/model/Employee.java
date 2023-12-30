package com.jpaoracleapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	          @Id
	          @GeneratedValue(strategy=GenerationType.SEQUENCE)
	          private Integer id;
	          private String name;
	          private String address;
	          private long salary;
	          
	          public Employee() {
	        	  
	          }

			public Employee(Integer id, String name, String address, Long salary) {
				super();
				this.id = id;
				this.name = name;
				this.address = address;
				this.salary = salary;
			}

			public Integer getId() {
				return id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public long getSalary() {
				return salary;
			}

			public void setSalary(long i) {
				this.salary = i;
			}

			@Override
			public String toString() {
				return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
			} 
}

