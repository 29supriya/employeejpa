package com.example.employee.employeejpa;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	
	@GetMapping("/employee-list")
	public ArrayList<Employee> employeeList()
	{
		return empService.allEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getById(@PathVariable int id) {
		return empService.employeeById(id);
	}
	
    @PostMapping("/add-employee")
    public String addId(@RequestBody Employee emp)
    {
    	return empService.addEmployee(emp);
    }
    
@DeleteMapping("/delete-employee")
public String deleteEmployee(@RequestParam int id)
{
	return empService.deleteEmployee(id);

}

@PutMapping("/edit-employee/{id}/{salary}")

public String updateEmployee(@PathVariable int id,@PathVariable double salary) {
	if(salary==0 || id==0)
	{
		return "Please enter salary & Id ";
	}
	return empService.editEmployee(salary,id);
}
}









