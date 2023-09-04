package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmpCredentialImpl;

public class DriverApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the First Name");
		
		String f = sc.next();
		
		System.out.println("Please enter the Last Name");
		String l = sc.next();
		
		Employee emp1 = new Employee(f , l);
		EmpCredentialImpl cred = new EmpCredentialImpl();
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		int choice=sc.nextInt();
		String genEmail="";
		String genPassword="";
		
		switch(choice) {
		
		case 1:genEmail= cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "tech");
		        break;
		
		case 2:genEmail= cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "admin");
        break;
		
		case 3:genEmail= cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "hr");
        break;
		
		case 4:genEmail= cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "legal");
        break;
        
        default:
           System.out.println("Please enter valid input()");
           		
	}
		
		genPassword = cred.generatePassword();
		emp1.setEmailid(genEmail);
		emp1.setPassword(genPassword);
		
		cred.showDetails(emp1);
		

	}
}
