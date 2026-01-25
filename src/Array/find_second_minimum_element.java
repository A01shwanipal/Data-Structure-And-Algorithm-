package Array;

public class find_second_minimum_element {

	
	public static void main(String[] args) {
		
		
		int arr[] = {3,3,4,9,0};
		
		int min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;
				
		
		
		for(int no :arr) {
			 if(no < min) {
				  min= no;
			 }
		}
		
		
		for(int no :arr) {
			 if(no != min && no < second_min) {
				 second_min = no;
				  
			 }
		}
		
		
		    
			System.out.print(second_min);
			
		
			
		
	}
}
