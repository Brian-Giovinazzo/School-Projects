/**
 * This program will get a word from the user and display it vertically
 * @author Brian Giovinazzo
 * 01/21/2022
 */
import java.util.*;

public class Project3Problem3 {

	public static void main(String[] args) {
		
		System.out.print("Please enter a word: ");
		
		Scanner scnr = new Scanner(System.in);
		
		String userWord = scnr.next();
		int wordLength = userWord.length();
		
		for (int i = 0; i < wordLength; i++) {
			System.out.println(userWord.charAt(i));
		}
		
		scnr.close();

	}

}
