package com.EmployeeWages.java;

import java.util.Random;

public class EmployeeWages {
	
	int wagePerhour = 20;
	int fullDayhour = 8;
	int partTimehour = 4;

	public static void main(String[] args) {
		
		System.out.println(" Welcome to Employee Wage Computation ");
		EmployeeWages obj = new EmployeeWages();
        Random random = new Random();
		
        int attendance = random.nextInt(3);
        
        if (attendance == 1 ) {
        	
        	System.out.println(" Employee is Present ");
        	obj.employeeWage();
        	
          } else if(attendance == 2) {
          	
          	System.out.println(" Part time Employee ");
          	System.out.println(" Part time hour : " +obj.partTimehour);
          	
          } else {
          	
          	System.out.println(" Employee is Absent ");
          }
  	}
  	
  	public void employeeWage() {
  		int dailyWage = wagePerhour * fullDayhour;
  		System.out.println(" Employee daily wage is : "+ dailyWage);
  	}
 
}
		

	