package com.EmployeeWages.java;

import java.util.Random;

public class EmployeeWages {
	
	int wagePerhour = 20;
	int fullDayhour = 8;
	int partTimehour = 4;
	int working_DayperMonth = 20;
	
	public static void main(String[] args) {
		
		System.out.println(" Welcome to Employee Wage Computation ");
		EmployeeWages obj = new EmployeeWages();
        Random random = new Random();
		
        int attendance = random.nextInt(3);
        switch(attendance){
		 
		case 0 : System.out.println(" Employee is absent ");
		         break;
		case 1: System.out.println(" Employee is Present ");
    	        obj.employeeWage();
    	        break;
		case 2: System.out.println(" Part time Employee ");
    	        System.out.println(" Part time hour : " +obj.partTimehour);
    	        System.out.println(" Wage for month part time Employee : " + obj.partTimehour * obj.working_DayperMonth);
    	        break;
		}
        
  	}
  	
  	public void employeeWage() {
  		int dailyWage = wagePerhour * fullDayhour * working_DayperMonth;
  		System.out.println(" Employee daily wage is : "+ dailyWage);
  	}
 
}
		

	