package com.jpaoracleapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpaoracleapp.model.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long>{
    
	         //public List<Employee> findByAddress(String address);
	         
	         public List<Employee> findBySalaryGreaterThanEqual(int salary);
	         
	        // public List<Employee> findByGender(String gender);
	            //find by gender based who are city with bangalore.
	        // public List<Employee> findByGenderAndAddress(String gender,String address);
	         
	         @Query("from Employee where address= :address")
	         public List<Employee> getAddressNames(@Param("address") String address);
	         
	         @Query("update Employee set salary=:salary where id=:id")
	         @Transactional
	         @Modifying
	         public void updateBySalary(long salary,int id);
	         
	         @Query("delete from Employee where id=:id")
	         @Transactional
	         @Modifying
	         public void deleteByUserId(int id);
	         
}
