package Array;

public class find_second_maxmum_element {

	
	public static void main(String[] args) {
		
		
		int arr[] = {3,3,4,9,0};
		
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
				
		
		
		for(int no :arr) {
			 if(no > max) {
				  max = no;
				  
				  }
		}
		
		
		for(int no :arr) {
			 if(no != max && no > second_max) {
				 second_max = no;
			 }
		}
		
		
		    
			System.out.print(second_max);
			
		
			
		
	}
}
