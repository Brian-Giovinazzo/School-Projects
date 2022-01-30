/**
 * This program will take an integer input and print out the sum of its digits
 * @author Brian Giovinazzo
 * 01/21/2022
 */
import java.util.*;

public class Project3Problem1 {

	public static void main(String[] args) {
		
		System.out.print("Please enter an integer: ");
		Scanner scnr = new Scanner(System.in);
		
		//Screens for non-integers
		while (!scnr.hasNextInt()) {
			System.out.print("Invalid integer. Please enter an integer: ");	
			scnr.nextLine();
		} 
		
		//Initialize variables and get length of number to determine math below
		//before converting it back to integer
		String userStr = scnr.nextLine();
		int userNum = Integer.parseInt(userStr);
		int numLength = userStr.length();
		int n = 0;
		int sum = 0;
		
		//Mathematical formula for extracting each individual number and adding them
		for (int i = 0; i <= numLength; i++) {
			n = (int) (userNum / Math.pow(10, i) % 10);
			sum += n;
		}
		
		System.out.println(sum);
		
		scnr.close();		

	}

}
