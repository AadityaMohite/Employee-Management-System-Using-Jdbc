package com.Main;
import java.util.ArrayList;
import java.util.Scanner;
import com.controller.EmployeeController;
import com.entity.Employee;
public class Employeemain {

	   
	 public static void main(String[]args) {
		 
	    	Scanner sc = new Scanner(System.in);
	    	EmployeeController control = new EmployeeController();
	     	
	    	
	    	while(true) {
	    		System.out.println("1.Save the Employee");
	    		System.out.println("2.Update the Employee");
	    		System.out.println("3.Display the Employee Details By ID");
	    		System.out.println("4.Display All employee Details");
	    		System.out.println("5.Delete Employee By ID");
	    		System.out.println("6.Delete all Employees");
	    		System.out.println("7.Get Male Employees details");
	    		System.out.println("8.Get Female Employees details");
	    		System.out.println("9.Exit");
	    		
	    		System.out.println("Enter the Choice: ");
	    		int choice = sc.nextInt();
	    		
	    		switch(choice) {
	    		case 1: 
	    			System.out.println("Enter the Employee ID: ");
		        	int id = sc.nextInt();
		    	
		    	    sc.nextLine();
		    	
		      	System.out.println("Enter the Employee Name: ");
		    	    String name = sc.nextLine();
		    	
		      	System.out.println("Enter the Employee Salary: ");
		    	    double salary = sc.nextDouble();
		    	
		    	    sc.nextLine();
		    
		    	    
		      	System.out.println("Enter the Employee Deprtment: ");
		      	String dep = sc.nextLine();
		    	
		    	    System.out.println("Enter the Employee Gender: ");
		    	    String gender = sc.nextLine();
		    	    
		    	    Employee emp = new Employee(id,name,salary,dep,gender);
		    		
			     String msg = 	control.saveEmployee(emp);
			     System.out.println(msg);
			     
			   break;
			   
	    		case 2: 
	    		System.out.println("Enter the Employee ID: ");
	        	int id1 = sc.nextInt();
		    	
	    	    sc.nextLine();
	    	
	      	System.out.println("Enter the Employee Name: ");
	    	    String name1 = sc.nextLine();
	    	
	      	System.out.println("Enter the Employee Salary: ");
	    	    double salary1 = sc.nextDouble();
	    	
	    	    sc.nextLine();
	    	
	    	
	      	System.out.println("Enter the Employee Deprtment: ");
	      	String dep1 = sc.nextLine();
	    	
	    	    System.out.println("Enter the Employee Gender: ");
	    	    String gender1 = sc.nextLine();
	    	    
	    	    Employee emp1 = new Employee(id1,name1,salary1,dep1,gender1);
		     String msg1 = 	control.UpdateEmployee(emp1);
		     System.out.println(msg1);
		     
		     break;
		     
	    		case 3: System.out.println("Enter the Employee ID: ");
	    		        int id3 = sc.nextInt();
	    		        try {
	    			 Employee emp2 =  control.Display(id3);
	    			 
	    			 System.out.println("Employee ID: "+emp2.getId());
	    			 System.out.println("Employee Name: "+emp2.getName());
	    			 System.out.println("Employee Salary: "+emp2.getSalary());
	    			 System.out.println("Employee Department: "+emp2.getDep());
	    			 System.out.println("Employee Gender: "+emp2.getGender());
	    			 System.out.println("--------------------------------------");
	    		        }catch(Exception e) {
	    		        	System.out.println(e.getMessage());
	    		        }
	    			  break;
		     
	    		case 4: 
	    		        ArrayList<Employee> aemp =  control.getAlldetails();
	    		       for(Employee employee:aemp) {
	    		    	      System.out.println("Employee ID: "+employee.getId());
	    		    	      System.out.println("Employee Name: "+employee.getName());
	    		    	      System.out.println("Employee Salary: "+employee.getSalary());
	    		    	      System.out.println("Employee Department: "+employee.getDep());
	    		    	      System.out.println("Employee Gender: "+employee.getGender());
	    		    	      System.out.println("---------------------------------------------");
	    		       }
	    		     break;
	    		     
	    		     
	    		case 5:  
	    			       System.out.println("Enter the Employee ID: ");
	    			       int id4 = sc.nextInt();
	    			       String msg3 = control.DeleteByID(id4);
	    			       System.out.println(msg3);
	    			 break;
	    			 
	    			 
	    		case 6:     String msg4 = control.Deleteall();
	    		            System.out.println(msg4);
	    			  break;
	    			  
	    		case 7:  ArrayList<Employee> male = control.getAllmaleEmployee();
	    		            for(Employee m:male) {
	    		            	  System.out.println("ID: "+m.getId());
	    		            	  System.out.println("Name: "+m.getName());
	    		            	  System.out.println("Salary: "+m.getSalary());
	    		            	  System.out.println("Department: "+m.getDep());
	    		            	  System.out.println("Gender: "+m.getGender());
	    		            	  System.out.println("======================================");
	    		            }
	    		          break;
	    		case 8:   ArrayList<Employee> female = control.getAllfemaleEmployee();
	    		            for(Employee fe : female) {
	    		            	 System.out.println("ID: "+fe.getId());
	    		            	 System.out.println("Name: "+fe.getName());
	    		            	 System.out.println("Salary: "+fe.getSalary());
	    		            	 System.out.println("Department: "+fe.getDep());
	    		            	 System.out.println("Gender: "+fe.getGender());
	    		            	 System.out.println("======================================");
	    		            }
	    		     break;
	    		case 9: System.out.println("Existing...");
	    		     break;
	    		default: System.out.println("Invalid Option");
	    		
			    
	    		}
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    
	    	
	    	
	    	
	    
	    	       
	   
	     
	     
	    
	    }
	    
	    
	
	
}
