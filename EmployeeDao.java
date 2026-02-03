package com.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.entity.Employee;
import com.util.JDBCutil;

public class EmployeeDao {
     
    Connection con = JDBCutil.jdbcConnection();
	
    
    
      public String SaveEmployee(Employee employee) {
    	  
    	  PreparedStatement ps = null;
    	  
    	      try {
    	         ps =  con.prepareStatement("insert into Employee values (?,?,?,?,?);");
    	         ps.setInt(1, employee.getId());
    	         ps.setString(2, employee.getName());
    	         ps.setDouble(3, employee.getSalary());
    	         ps.setString(4, employee.getGender());
    	         ps.setString(5,employee.getDep());
    	         
    	         
    	         ps.executeUpdate();
    	         
    	     
    	      }catch(Exception e){
    	    	  
    	    	  System.out.println(e.getMessage());
    	    	  
    	    	  
    	      }
    	  
    	    return "Employee Register Sucessfully";
    	  
      }
      
      public String UpdateEmployee(Employee employee) {
    	     PreparedStatement ps = null;
    	     
    	       try {
    	    	     ps = con.prepareStatement("update Employee  set name=?,salary=?,dep=?,gender=? where id=?;");
    	    	     
    	    	     ps.setString(1,employee.getName());
    	    	     ps.setDouble(2, employee.getSalary());
    	    	     ps.setString(3,employee.getDep());
    	    	     ps.setString(4,employee.getGender());
    	    	     ps.setInt(5, employee.getId());
    	    	     
    	    	     
    	    	     ps.executeUpdate();
    	    	     
    	    	     
    	    	     
    	       }catch(Exception e) {
    	    	    System.out.println(e.getLocalizedMessage());
    	       }
    	       
    	       
    	       
    	       return "Employee Update Sucessfully";
      }
    
    
      public Employee Display(int id) {
    	     PreparedStatement ps = null;
    	     Employee emp = null;
    	     try {
    	       ps = con.prepareStatement("Select * from Employee where id=?;");
    	       ps.setInt(1, id);
    	       ResultSet rs = ps.executeQuery();
    	       while(rs.next()) {
    	    	    int id2 = rs.getInt("id");
    	    	    String name = rs.getString("name");
    	    	    double salary = rs.getDouble("salary");
    	    	    String dep = rs.getString("dep");
    	    	    String gender = rs.getString("gender");
    	    	    
    	    	   emp = new Employee(id2,name,salary,dep,gender);
    	    	  
    	       }
    	     }catch(Exception e) {
    	    	 System.out.println(e.getMessage());
    	     }
			return emp;
    	     
    	  
      }
      
      public ArrayList<Employee> getAlldetails() {
    	     
    	   PreparedStatement ps = null;
    	   ArrayList<Employee> aemp = new ArrayList<Employee>();
    	   try {
    		   ps = con.prepareStatement("Select * From Employee;");
    		   ResultSet rs = ps.executeQuery();
    		   while(rs.next()) {
    			   int id = rs.getInt("id");
    			   String name = rs.getString("name");
    			   double salary = rs.getDouble("salary");
    			   String dep = rs.getString("dep");
    			   String gender = rs.getString("gender");
    			   Employee emp = new Employee(id,name,salary,dep,gender);
    			   aemp.add(emp);
    		   }
    		    
    	   }catch(Exception e) {
    		   System.out.println(e.getMessage());
    	   }
    	  
    	    return aemp;
      }
	
      
       public String DeleteByID(int id) {
    	    PreparedStatement ps = null;
    	    try {
    	    	   ps = con.prepareStatement("Delete From Employee where id=?;");
    	    	   ps.setInt(1, id);
    	    	   ps.executeUpdate();
    	    }catch(Exception e) {
    	    	   System.out.println(e.getMessage());
    	    }
    	    
    	    return "Employee Deleted Sucessfully";
       }
       
       public String Deleteall() {
    	   PreparedStatement ps = null;
    	   try {
    		   ps = con.prepareStatement("truncate Employee;");
    		   ps.executeUpdate();
    		   
    	   }catch(Exception e) {
    		   System.out.println(e.getMessage());
    	   }
    	   return "Delete all Employees";
       }
       
      
}
