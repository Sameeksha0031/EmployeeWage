package com.EmployeeWage;
 

public class EmployeeWages {
	
	int wagePerhour = 20;
	int working_DayperMonth = 20;
	
	public void computeAttendance() {
	   int totalWorkinghour = 0;
	   int days = 0; 
	   do {
		 days = days + 1;
		 System.out.println(days);
		 System.out.println("  ");
		 int attendance = (int)(Math.random() *10 )%3;
		 switch(attendance){
			 
			case 0 : System.out.println(" Employee is absent ");
			         break;
			
			case 1: System.out.println(" Employee is Present ");
	    	        calculateEmployeeWage();
	    	        break;
			
			case 2: int partTimehour = 4;
				    System.out.println(" Part time Employee ");
	    	        System.out.println(" Part time hour : " +partTimehour *wagePerhour*working_DayperMonth);
	    	        break;
			}
		   totalWorkinghour = totalWorkinghour + 1;
		   System.out.println();
	     }while (totalWorkinghour <= 100 && days <20 );
	 }
	
     public void calculateEmployeeWage() {
			int fullDayhour = 8;
			int dailyWage = wagePerhour * fullDayhour * working_DayperMonth;
			System.out.println(" Employee daily wage is : "+ dailyWage);
		}
	 
	   public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
	    EmployeeWages employee = new  EmployeeWages();
		employee.computeAttendance();
	  }

}
	

	