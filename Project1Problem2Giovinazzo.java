/**
 * Takes first name, last name, and id number as inputs and generates an e-mail address.
 * @author - Brian Giovinazzo 01/07/2022
 */
import java.util.*;

public class Project1Problem2Giovinazzo {

	public static void main(String[] args) {
		
		//Variables and utilities
		Scanner scnr = new Scanner(System.in);
		String firstName, lastName;
		char firstInitial, lastInitial;
		String idNum;
		
		//Obtains user's information, formats names
		System.out.print("Please enter your first name: ");
		firstName = scnr.next().toUpperCase();
		System.out.print("Please enter your last name: ");
		lastName = scnr.next().toUpperCase();
		System.out.print("Please enter your ID#: ");
		idNum = scnr.next();
		
		//More variables
		firstInitial = firstName.charAt(0);
		lastInitial = lastName.charAt(0);
		
		//Prints out the user's e-mail address in desired format
		System.out.printf("Your e-mail address is: %c.%c.%s@wcupa.edu", firstInitial, lastInitial, idNum);
		
		//Closes scanner
		scnr.close();

	}

}
