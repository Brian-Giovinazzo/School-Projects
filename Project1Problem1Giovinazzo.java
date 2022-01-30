/**
 * Take a name input, reverses and capitalizes it.
 * @author - Brian Giovinazzo 01/07/2022
 */
import javax.swing.*;

public class Project1Problem1Giovinazzo {

	public static void main(String[] args) {
		
		//Variables
		String name;
		String nameUp;
		char ch1;
		char ch2;
		char ch3;
		char ch4;
		
		//Obtains user's name
		name = JOptionPane.showInputDialog("Please enter a 4 character name: ");
		
		//Converts user input to upper case
		nameUp = name.toUpperCase();
		
		//Obtains each character of the upper case user's name
		ch1 = nameUp.charAt(0);
		ch2 = nameUp.charAt(1);
		ch3 = nameUp.charAt(2);
		ch4 = nameUp.charAt(3);
		
		//Prints out the reverse order of user's name in upper case
		System.out.printf("%c%c%c%c", ch4, ch3, ch2, ch1);
		
		System.exit(0);		
	}
}
