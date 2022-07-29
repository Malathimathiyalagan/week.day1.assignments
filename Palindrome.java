package week.day1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		//Declare A String value as"madam"
		String palindrome = "madam";
		//Declare another String rev value as ""
		String rev="";
		//Iterate over the String in reverse order
		for (int i = (palindrome.length()-1); i >=0; i--) {
			//Add the char into rev
			rev=rev+palindrome.charAt(i);
			
		}
		System.out.println(rev);
		//Compare the original String with the reversed String, if it is same then print palinDrome 
		if(palindrome.equalsIgnoreCase(rev)) {// Hint: Use .equals or .equalsIgnoreCase when you compare a String 
			System.out.println("The given word is palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}

}
