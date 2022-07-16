package com.EmployeeWages.java;

import java.util.Random;

public class EmployeeWages {

	public static void main(String[] args) {
		
		System.out.println(" Welcome to Employee Wage Computation ");
        Random random = new Random();
		
        int attendance = random.nextInt(2);
        
        if (attendance == 1 ) {
        	
        	System.out.println(" Employee is Present ");
        	
        } else {
        	
        	System.out.println(" Employee is Absent ");
        }
		
	}
}
		

	