package com.example.employee.employeejpa;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
	ArrayList<Employee> allEmployee();
	Employee employeeById(int id);
	String addEmployee(Employee emp);
	String deleteEmployee(int id);
	String editEmployee(double salary,int id);

}
