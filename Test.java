package com.gl.email.main;
import java.util.Scanner;

import com.gl.email.service.CredentialService;
import com.gl.email.service.CredentialServiceImpl;
import com.gl.emailapp.model.Employee;

public class Test {
	
	public static void name(String[]args) {
		
		CredentialService service =new CredentialServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String fn=sc.next();
		
	    System.out.println("Enter Last Name");
	    String ln=sc.next();
	    
	    System.out.println("Enter Department Name");
	    String dept =sc.next();
	    
	    String password=service.generatePassword();
	    System.out.println(password);
	   
	    String email = service.genarationEmailAddress(fn,ln,dept);
	    
	    Employee emp = new Employee();
	    
	     emp.setPassword(password);
	     emp.setEmail(email);
	    service.showCredentials(emp);
	    
	    
	    
	    
	    
	}   
	    
	} 
