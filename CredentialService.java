package com.gl.email.service;
import com.gl.emailapp.model.Employee;

public interface CredentialService {
	public String genarationEmailAddress(String firstName,String lastName,String department);
	public String generatePassword();
    public void showCredentials (Employee employee);
	void showCredentials(com.gl.email.model.Employee employee);
    
}

