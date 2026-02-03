package com.controller;

import java.util.ArrayList;

import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeController {

	EmployeeService service = new EmployeeService();
	
	   public String saveEmployee(Employee employee) {
		   
		  String msg =    service.Service(employee);
		     return msg;
	   }
	   
	   public String UpdateEmployee(Employee employee) {
		   String msg = service.UpdateEmployee(employee);
		   return msg;
	   }
	   
	   public Employee Display(int id) {
		  Employee emp = service.Display(id);
		  return emp;
	   }
	   
	   public ArrayList<Employee> getAlldetails() {
		   ArrayList<Employee> aemp = service.getAlldetails();
		   return aemp;
	}
	   
	   public String DeleteByID(int id) {
		     String msg = service.DeleteByID(id);
		     return msg;
	   }
	   public String Deleteall() {
		   String msg = service.Deleteall();
		   return msg;
	   }
	   public ArrayList<Employee> getAllmaleEmployee() {
		   ArrayList<Employee> aemp = service.getAllmaleEmployee();
		   return aemp;
	}
	   public ArrayList<Employee> getAllfemaleEmployee() {
		   return service.getAllfemaleEmployee();   
	}
	   
	   
	
}
