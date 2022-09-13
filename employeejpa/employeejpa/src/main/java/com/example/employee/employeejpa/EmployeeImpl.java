package com.example.employee.employeejpa;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Override
	public ArrayList<Employee> allEmployee(){
		return empRepo.findAll();
		
	}
	@Override
   public Employee employeeById(int id) {
		Employee employee = empRepo.findById(id);
		if(employee != null)
			return employee;
		else 
			return null;
	}
	@Override
	public String addEmployee(Employee empl) {
		empRepo.save(empl);
		return "Employee Details Added Successfully";
	}
	@Override
	public String deleteEmployee(int id)
	{
		
		Employee employee= empRepo.findById(id);
		if(employee!=null)
		{
			empRepo.delete(employee);
			return "Employee Record Deleted SuccessFully";
		}
		return "Employee not found by Id: "+id;
	}
	@Override
	public String editEmployee(double salary, int id)
	{
		Employee employee = emRepo.findByID(id);
		if(employee !=null)
		{
			employee.setSalary(salary);
			employee.setId(id);
			employee.save(employee);
			return "Record updated successfully";
		}
		return "Employee details not foundv by id: "+id;
		}
		}
		
		
		
		
		
		
		
	

