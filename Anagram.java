package week.day1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		String text1 = "stops";
		String text2 = "potss"; 
		int length1=text1.length();
		int length2=text2.length();
		//Check length of the strings are same then (Use A Condition)
		if(length1==length2) {
			System.out.println("The two lengths are same");
		}
		//Convert both Strings in to characters
		char[] a= text1.toCharArray();
		char[] b= text2.toCharArray();
		//Sort Both the arrays
		Arrays.sort(a);
		System.out.println("**sorted Array of a**");
		System.out.println(a);
		Arrays.sort(b);
		System.out.println("**sorted Array of b**");
		System.out.println(b);
		if(Arrays.equals(a, b)) {//Check both the arrays has same value
			System.out.println("The given sritngs are same");
			
		}
		else {
			System.out.println("The given strings are not same");
		}
	}

}
