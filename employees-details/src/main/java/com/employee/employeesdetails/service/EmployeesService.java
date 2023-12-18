package com.employee.employeesdetails.service;

import java.util.List;
import com.employee.employeesdetails.entities.Employees;
import com.employee.employeesdetails.entities.EmployeesDetailsDto;

public interface EmployeesService  {
	
	Employees addEmployee(Employees employees);
	
	Employees save(EmployeesDetailsDto employeesDetailsDto );
	
	List<Employees> getAllEmployees();
	
	void deleteEmployee(Long id);
	
	Employees updateEmployee(Employees employees);

}
