/**
 * This program will take an integer input and determine whether or not it is a prime number
 * @author Brian Giovinazzo
 * 01/21/2022
 */
import java.util.*;

public class Project3Problem2 {

	public static void main(String[] args) {
		
		System.out.print("Please enter an integer (negative values will be made positive): ");
		Scanner scnr = new Scanner(System.in);
		
		//Screens for non-integers
		while (!scnr.hasNextInt()) {
			System.out.print("Invalid integer. Please enter an integer: ");	
			scnr.nextLine();
		}
		
		int userNum = Math.abs(scnr.nextInt());
		boolean flag = false;
	    
		//Determines if prime or not
		if ((userNum != 0) && (userNum != 1)) {
			for (int i = 2; i <= userNum / 2; i++) {
				if (userNum % i == 0) {
					flag = true;
					//Alerts user to what their number is divisible by and that it is not a prime number
					int secondNum = userNum / i;
					System.out.printf("%d is divisible by %d and %d and therefore, not a prime number.%n", userNum, i, secondNum);
					break;
				}
			}
		}
		else {
			flag = true;
			System.out.printf("%d is not a prime number.", userNum);
		}
		
		if (flag == false) {
			System.out.printf("%d is a prime number.", userNum);
		}
		
	    scnr.close();
	    
	}

}
