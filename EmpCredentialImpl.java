package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmpCredentialImpl implements EmpCredentials {

	
	public String generateEmailId(String fname, String lname, String dept) {
	
		return fname + lname+"@" + dept + "gl.com";
	}

	
	public String generatePassword() {
		
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="1234567890";
		String splchars="!@#$%^&*()";
		
		String combined=caps+lower+nums+splchars;  //72 chars
		String pass="";
		Random random=new Random();
		for(int i=0;i<8;i++)
		{
		pass=pass+String.valueOf(combined.charAt(random.nextInt(combined.length()))); 
		}
		return pass;

	}

	
	public void showDetails(Employee e) {
		
		System.out.println(e.getFname());
		System.out.println(e.getLname());
		System.out.println(e.getEmailid());
		System.out.println(e.getPassword());
		
	
	
		
	}

}
