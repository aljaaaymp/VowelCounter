/**
* Java Course 2, Module 3
* 
* Vowel Counter
*
* @author Aljay Pascual
*/
package graded;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lineOfText;
		Scanner stdln = new Scanner(System.in);
		
		VowelCounter vowelCounter = new VowelCounter ();
		
		
		do
		{
		
		System.out.println("Enter a line of characters (press enter by itself to quit): ");
		
		lineOfText = stdln.nextLine();
		vowelCounter.processLine(lineOfText);
		
		} while (!lineOfText.matches(""));
		
		vowelCounter.printSummary();
				
		stdln.close(); // closing the object scanner
	}

}
