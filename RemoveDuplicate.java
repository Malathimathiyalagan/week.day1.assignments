package week.day1.assignments;

public class RemoveDuplicate {

	public static void main(String[] args) {
	
 
 	
 
		
		String text = "We learn java basics as part of java sessions in java week1";
		//Initialize an integer variable as count
		int count= 0;
		
		//Split the String into array and iterate over it
		String[] split= text.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length; j++) {//Initialize another loop to check whether the word is there in the array
				if(split[i].equalsIgnoreCase(split[j])) {
					split[j]= "";//if the count > 1 then replace the word as ""
					count++;//if it is available then increase and count by 1. 
			
				}
					
			}
			
		}
		if(count>1) {//Displaying the String without duplicate words
			for (int k = 0; k < split.length; k++) {
				System.out.println(split[k]);
			}
				
		}
	}

}
