package com.employee.employeesdetails.entities;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private Date dob;
	
	private String gender;
	
	private String education;
	
	private String company;
	
	private long experience;
	
	private long salarypackage;

	public Employees() {
		super();
	}

	public Employees(long id, String firstName, String lastName, String email, Date dob, String gender,
			String education, String company, long experience, long salarypackage) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.education = education;
		this.company = company;
		this.experience = experience;
		this.salarypackage = salarypackage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Employees [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", dob=" + dob + ", gender=" + gender + ", education=" + education + ", company=" + company
				+ ", experience=" + experience + ", salarypackage=" + salarypackage + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(company, dob, education, email, experience, firstName, gender, id, lastName, salarypackage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return Objects.equals(company, other.company) && Objects.equals(dob, other.dob)
				&& Objects.equals(education, other.education) && Objects.equals(email, other.email)
				&& experience == other.experience && Objects.equals(firstName, other.firstName)
				&& Objects.equals(gender, other.gender) && id == other.id && Objects.equals(lastName, other.lastName)
				&& salarypackage == other.salarypackage;
	}
	
	
	
	
//	"firstName": "shreyas",
//    "lastName": "g",
//    "email": "shreyas@gmail.com",
//    "dob": "2001-07-06T18:30:00.000Z",
//    "gender": "male",
//    "education": "Graduate",
//    "company": "dxc",
//    "experience": 1,
//    "salarypackage": 4,
//    "id": 2

}
