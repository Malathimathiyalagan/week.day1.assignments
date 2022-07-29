package week.day1.assignments;

import java.util.Arrays;

public class MissingElememtsInArrayList {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		//Sort the array	
		Arrays.sort(arr);
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			}
		// check if the iterator variable is not equal to the array values respectively
		for (int j = 0; j < arr.length; j++) {
			
			if ((j+1)!=arr[j])
					{
				// print the number
				System.out.println(("Missing element is: ") +(j+1));
				// once printed break the iteration
				
				break;
		}
	
		
		}		
	}
	
}





	

			
			
				
				
				