package com.sam.crud.CrudEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Long Salary;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, Long salary) {
		super();
		this.name = name;
		Salary = salary;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salary) {
		Salary = salary;
	}
	
}
