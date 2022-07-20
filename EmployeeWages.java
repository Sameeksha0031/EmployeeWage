package com.EmployeeWage;

public class EmployeeWages {
	
	public void computeEmpWage(String company,int wagePerhour, int working_DayperMonth, int fullDayhour) {
		  int totalWorkinghour = 0;
		  int days = 0; 
		  System.out.println(company);
	      while (totalWorkinghour <= 100 && days <20 ){
			 days = days + 1;
			 int attendance = (int)(Math.random() *10 )%2;
			 switch(attendance){
				
				case 0 : calculateEmployeeWage(wagePerhour,working_DayperMonth, fullDayhour);
		    	         break;
				
				case 1 : int partTimehour = fullDayhour / 2;
				         int partTimeWage = partTimehour *wagePerhour*working_DayperMonth;
				         System.out.println("Wage Per Hour\t:"+ wagePerhour +
				                            "\nWorking Days \t:"+ working_DayperMonth +
				                            "\nWorking Hour \t:"+ partTimehour + 
				                            "\nPartime Employee wage is : "+ partTimeWage);
		    
		    	         break;
		    	        
				default: System.out.println("Employee Wage = 0");        
		       }
			 totalWorkinghour = totalWorkinghour + 1;
			 System.out.println();
	       }
	      int totalEmpWage  = totalWorkinghour * wagePerhour * working_DayperMonth;
	      System.out.println("Total Full time Employee Wage for "+company+" is:" + totalEmpWage);
	}
	
	
	public void calculateEmployeeWage(int wagePerhour, int working_DayperMonth, int fullDayhour) {
		int dailyWage = wagePerhour * fullDayhour * working_DayperMonth;
		System.out.println("Wage Per Hour\t:"+ wagePerhour +
				           "\nWorking Days \t:"+ working_DayperMonth +
				           "\nWorking Hour \t:"+ fullDayhour + 
				           "\nEmployee wage is : "+ dailyWage);
	}
	
	public static void main(String[] args) {
		
		System.out.println(" Welcome to Employee Wage Computation ");
		EmployeeWages wages = new EmployeeWages();
		wages.computeEmpWage("Dmart", 200, 2, 20);
		wages.computeEmpWage("Reliance", 300, 4, 20);
	}
 
}
		

	