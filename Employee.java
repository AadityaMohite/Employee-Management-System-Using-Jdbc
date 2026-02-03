package com.entity;

public class Employee {
	
    private String name;
    private int id;
    private double salary ;
    private String dep;
    private String gender;
	public Employee(int id, String name, double salary, String dep, String gender) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dep = dep;
		this.gender = gender;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
    
   
    
    
    
    
}
