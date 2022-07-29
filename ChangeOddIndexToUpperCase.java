package week.day1.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
				/* 
			 
			 
			 * c)find the odd index within the loop (use mod operator)
			 
			 * d)within the loop, change the character to uppercase, if the index is odd else don't change
			  
			 */
		String test="changeme";
		//Convert the String to character array
		char[] chararray =test.toCharArray();
		//Traverse through each character (using loop)
		for (int i = 0; i < chararray.length; i++) {
			if(i%2 == 0) {
				chararray[i]= Character.toUpperCase(chararray[i]);
				System.out.println(chararray[i]);
			}
			else {
			System.out.println(chararray[i]);
		}
		
		}

	}}


