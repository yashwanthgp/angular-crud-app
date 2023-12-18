package com.employee.employeesdetails.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.employeesdetails.entities.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {
	
	Optional<Employees> findById(Long id);

}
