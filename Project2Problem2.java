/**
 * This program determines if a user entered year is a leap year and takes a user entered number
 * and converts it to the corresponding month
 * @author Brian Giovinazzo
 * 01/14/2022
 */
import java.util.*;

public class Project2Problem2 {

	public static void main(String[] args) {
	    
		//Declares variables and opens Scanner
		Scanner scnr = new Scanner(System.in);
	    String monthName = null;
		int inputYear = 0;
	    int leapCentury = 0;
	    int leapYear = 0;
	    int century = 0;
	    int inputMonth = 0;
	    boolean isLeapYear = false;
	   
	    //Obtains year from user and prompts to re-enter if negative
	    do {
	    	System.out.print("Please enter a year: ");
	    	inputYear = scnr.nextInt();
	    } while (inputYear < 0);
	    
	    //Obtains month number from user
	    System.out.print("Please enter a month number from 1 - 12: ");
	    inputMonth = scnr.nextInt();
	    
	    ////Determines month based on user input
	    switch (inputMonth) {
    	case 1: monthName = "January";
				break;
    	case 2: monthName = "February";
				break;
    	case 3: monthName = "March";
				break;
    	case 4: monthName = "April";
				break;
    	case 5: monthName = "May";
				break;
    	case 6: monthName = "June";
				break;
    	case 7: monthName = "July";
				break;
    	case 8: monthName = "August";
				break;
    	case 9: monthName = "September";
				break;
    	case 10: monthName = "October";
				break;
    	case 11: monthName = "November";
				break;
    	case 12: monthName = "December";
				break;
    	default: monthName = "Invalid month number";
    	}
	    
	    //Determines month based on user input and prompts them to re-enter if invalid
	    while (monthName == "Invalid month number") {

	    	System.out.print("Invalid number. Please enter a month number from 1 - 12: ");
		    inputMonth = scnr.nextInt();
	    	
	    	switch (inputMonth) {
	    	case 1: monthName = "January";
					break;
	    	case 2: monthName = "February";
					break;
	    	case 3: monthName = "March";
					break;
	    	case 4: monthName = "April";
					break;
	    	case 5: monthName = "May";
					break;
	    	case 6: monthName = "June";
					break;
	    	case 7: monthName = "July";
					break;
	    	case 8: monthName = "August";
					break;
	    	case 9: monthName = "September";
					break;
	    	case 10: monthName = "October";
					break;
	    	case 11: monthName = "November";
					break;
	    	case 12: monthName = "December";
					break;
	    	default: monthName = "Invalid month number";
	    	}
	    	
	    }
	    
	    //Calculations
	    leapCentury = inputYear % 400;
	    leapYear = inputYear % 4;
	    century = inputYear % 100;
	      
	    //Conditional statement determines if leap year or not
	    if (leapCentury == 0) {
	    	isLeapYear = true;
	    }
	    else if ((century != 0) && (leapYear == 0)) {
	    	isLeapYear = true;
	    }
	    
	    //Output for leap year
		if (isLeapYear == true) {
			System.out.printf("%d - leap year%n", inputYear);
		}
		else {
		    System.out.printf("%d - not a leap year%n", inputYear);
		}
		   	
	    	
	    //Output for month
	    System.out.printf("The month that corresponds to the input number is %s.%n", monthName);
	    
	    scnr.close();
	    
	}
	   
}
