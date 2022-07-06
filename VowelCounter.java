/**
* Java Course 2, Module 3
* 
* Vowel Counter
*
* @author Aljay Pascual
*/
package graded;

public class VowelCounter {
	
	int [][] vowelCounter = new int [5][3];
	
	char line;
	int vowel = 0;
	String lowerCase = "aeiou";
	

	
	public void processLine(String lineOfText)
	{
		
		
		for (int row = 0; row < lineOfText.length(); row++)
		{
			String charOfLine =	Character.toString(lineOfText.charAt(row)); // converting input words into character, and displaying in row
		
			for (int col = 0; col <lowerCase.length(); col++)
			{
				
				String charOfVowel = Character.toString(lowerCase.charAt(col)); // String lowerCase converted to character 
				
				if (charOfLine.equals(charOfVowel))	// if input text equals to lower case aeiou (charOfVowels)
				{
					vowelCounter [col][0]++; // incrementing index 0 if true
					
				}
				if (charOfLine.equals(charOfVowel.toUpperCase())) // converting aeiou (charOfVowels) to upper case and comparing it to input text
			
				{
					
					vowelCounter [col][1]++; // incrementing index 1 if true
					
				}  
				vowelCounter[col][2] = vowelCounter [col][0] + vowelCounter [col][1];
					
				
		}
		}
		
	}
	
	public void printSummary()
	{
		for(int row = 0; row < 5 ;row++)
		{
			String charOfVowel = Character.toString(lowerCase.charAt(row));
            System.out.println(charOfVowel.toUpperCase() + ": " + vowelCounter[row][0] +" lowercase, " + vowelCounter[row][1] + " uppercase, " + vowelCounter[row][2]  +" total");
	}

}
}