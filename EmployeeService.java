package com.service;

import java.util.ArrayList;

import com.Dao.EmployeeDao;
import com.entity.Employee;
import com.exception.EmployeeNotFoundException;

public class EmployeeService {
  
	EmployeeDao dao = new EmployeeDao();
	
	public String Service(Employee employee) {
		
		
		
		  String msg =  dao.SaveEmployee(employee);
		  if(msg==null) {
			  throw new EmployeeNotFoundException("Employee is Not Found");
		  }else {
		  return msg;
	}
		  }
	
	public String UpdateEmployee(Employee employee) {
		
		String msg = dao.UpdateEmployee(employee);
		if(msg==null) {
		return msg;
		}else {
			return msg;
		}
	}
	
	public Employee Display(int id) {
		Employee emp =   dao.Display(id);
		if(emp==null) {
			throw new EmployeeNotFoundException("Employee is Not Found");
		}else {
		return emp;
	}
	}
	public ArrayList<Employee> getAlldetails() {
		   ArrayList<Employee> aemp = dao.getAlldetails();
		   return aemp;
	}
	
	public ArrayList<Employee> getAllmaleEmployee(){
		ArrayList<Employee> aemp = dao.getAlldetails();
		ArrayList<Employee> maleemployee = new ArrayList<Employee>();
		for(Employee mp:aemp) {
			if(mp.getGender().equals("Male")) {
				maleemployee.add(mp);
			}
		}
		return maleemployee;
	}
	public ArrayList<Employee> getAllfemaleEmployee(){
		ArrayList<Employee> aemp = dao.getAlldetails();
		ArrayList<Employee> femaleemployee = new ArrayList<Employee>();
		for(Employee mp:aemp) {
			if(mp.getGender().equals("Female")) {
				femaleemployee.add(mp);
			}
		}
		return femaleemployee;
	}
	public String DeleteByID(int id) {
		 String msg =  dao.DeleteByID(id);
		 return msg;
	}
	
	public String Deleteall() {
		String msg = dao.Deleteall();
		return msg;
	}
}
