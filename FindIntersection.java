package week.day1.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		 	 							
		int arr1[] = {1,3,2,11,4,6,7};//array 1
		int arr2[] = {1,2,8,4,9,7,12};//array 2
		
		 // Declare for loop iterator from 0 to array length
		 for(int i = 0; i<arr1.length;i++) {
			// Declare a nested for another array from 0 to array length
			 for(int j=0;j<arr2.length;j++) {
				// Compare Both the arrays using a condition statement
				if (arr1[i]==arr2[j]) {
					 // Print the first array (shoud match item in both arrays)
					System.out.println(arr1[i]);
					
				}							 
				 
		 }	 
		 	 
	 }
	}
}


