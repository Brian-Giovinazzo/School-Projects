/**
 * This program will accept a 5-letter word and alter it based on if it is a palindrome or not
 * @author Brian Giovinazzo
 * 01/14/2022
 */
import javax.swing.*;

public class Project2Problem1 {

	public static void main(String[] args) {
		
		//Obtains input from user and declares variables
		String word = JOptionPane.showInputDialog("Please enter a 5-letter word: ");
		char first = word.charAt(0);
		char second = word.charAt(1);
		char fourth = word.charAt(3);
		char last = word.charAt(4);
		
		//Check if palindrome or not
		if ((first == last) && (second == fourth)) {
			//If palindrome, replaces first and last characters with *
			word = word.replace(first, '*');
		}
		else {
			//If not palindrome, reverses user input
			word = new StringBuilder(word).reverse().toString();
		}
		
		//Displays output
		JOptionPane.showMessageDialog(null, word);
		
		System.exit(0);

	}

}
