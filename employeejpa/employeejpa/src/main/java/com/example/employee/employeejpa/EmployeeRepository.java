package com.example.employee.employeejpa;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	Employee findById(int id);
	ArrayList<Employee> findAll();
}