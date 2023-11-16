package com.gl.email.service;

import com.gl.email.model.Employee;

public class CredentialServiceImpl implements CredentialService {
	String Capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String Small_chars="abcdefghijklmnopqrstuvwxyz";
	String numbers="0123456789";
	String symbols="!@#$%^&*_=+-/.?<>)";

	@Override
	public String genarationEmailAddress(String firstName, String lastName, String department) {
		return firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+"gl.in";
		
	}

	@Override
	public String generatePassword() {
		String values=Capital_chars+Small_chars+numbers+symbols;
	    Random random=new Random();
	    char[]password=new char [length];
	    for (int i=0;i<password.length;i++) {
	    	password[i]=values.charAt(random.nextInt(values.length()));
	    	
	    	
	    	
	    }
	    
	return String.valueOf(password);
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear"+ employee.getFirstName()+"your generated credentials");
		System.out.println("Email" + employee.getEmail());
		System.out.println("Password" + employee.getPassword());
	}
	
	

}
