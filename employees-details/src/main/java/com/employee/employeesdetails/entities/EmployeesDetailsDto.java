package com.employee.employeesdetails.entities;

import java.util.Date;

public class EmployeesDetailsDto {
	
   private String firstName;
	
	private String lastName;
	
	private String email;
	
	private Date dob;
	
	private String gender;
	
	private String education;
	
	private String company;
	
	private long experience;
	
	private long salarypackage;

	public EmployeesDetailsDto() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public long getExperience() {
		return experience;
	}

	public void setExperience(long experience) {
		this.experience = experience;
	}

	public long getSalarypackage() {
		return salarypackage;
	}

	public void setSalarypackage(long salarypackage) {
		this.salarypackage = salarypackage;
	}
	
	

}
