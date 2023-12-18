package com.employee.employeesdetails.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employee.employeesdetails.entities.Employees;
import com.employee.employeesdetails.entities.EmployeesDetailsDto;
import com.employee.employeesdetails.service.EmployeesService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employeess")
public class EmployeesController {
	
	private EmployeesService employeesService;

	public EmployeesController(EmployeesService employeesService) {
		super();
		this.employeesService = employeesService;
	}
	
	@ModelAttribute("employee")
	public EmployeesDetailsDto employeesDetailsDto() {
		return new EmployeesDetailsDto();
	}
	
	@GetMapping
	public List<Employees> getAllEmployees() {
		  List<Employees> employee =  employeesService.getAllEmployees();
		return employee;
	}
	
	@PostMapping
	public ResponseEntity<Employees> createEmployeees(@RequestBody Employees employees) {
		Employees savedEmployee = employeesService.addEmployee(employees);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("{id}")
	public void deleteCatalog(@PathVariable("id") Long id) {
		employeesService.deleteEmployee(id);		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Employees> updateProduct(@PathVariable ("id") Long id,
			                                          @RequestBody Employees employees) {
		employees.setId(id);
		Employees updateEmployee = employeesService.updateEmployee(employees);
		return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
	
    }
	

}
