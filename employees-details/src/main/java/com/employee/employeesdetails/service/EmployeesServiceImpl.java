package com.employee.employeesdetails.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.employee.employeesdetails.entities.Employees;
import com.employee.employeesdetails.entities.EmployeesDetailsDto;
import com.employee.employeesdetails.repositories.EmployeesRepository;


@Service
public class EmployeesServiceImpl implements EmployeesService {
	
	private EmployeesRepository employeesRepo;

	public EmployeesServiceImpl(EmployeesRepository employeesRepo) {
		super();
		this.employeesRepo = employeesRepo;
	}


	@Override
	public Employees save(EmployeesDetailsDto employeesDetailsDto) {
		
		Employees employee = new Employees(0, employeesDetailsDto.getFirstName(),
				employeesDetailsDto.getLastName(),
				employeesDetailsDto.getEmail(),
				employeesDetailsDto.getDob(),
				employeesDetailsDto.getGender(),
				employeesDetailsDto.getEducation(),
				employeesDetailsDto.getCompany(),
				employeesDetailsDto.getExperience(),
				employeesDetailsDto.getSalarypackage());
		
		return employeesRepo.save(employee) ;
	}

	@Override
	public List<Employees> getAllEmployees() {
		
		return employeesRepo.findAll();
	}


	@Override
	public void deleteEmployee(Long id) {
		
		employeesRepo.deleteById(id);
		
	}


	@Override
	public Employees addEmployee(Employees employees) {
		
		return employeesRepo.save(employees);
	}


	@Override
	public Employees updateEmployee(Employees employees) {
		
		Employees existingEmployee = employeesRepo.findById(employees.getId()).get();
		existingEmployee.setId(employees.getId());
		existingEmployee.setFirstName(employees.getFirstName());
		existingEmployee.setLastName(employees.getLastName());
		existingEmployee.setEmail(employees.getEmail());
		existingEmployee.setDob(employees.getDob());
		existingEmployee.setGender(employees.getGender());
		existingEmployee.setEducation(employees.getEducation());
		existingEmployee.setCompany(employees.getCompany());
		existingEmployee.setExperience(employees.getExperience());
		existingEmployee.setSalarypackage(employees.getSalarypackage());
		
		Employees updatedEmployee = employeesRepo.save(existingEmployee);
		
		return updatedEmployee;
	}
	

}
