package Array;

public class WAP_to_count_the_number_of_positive_negative_and_zero_elements {

	public static void main(String [] args) {
		
		int[] arr = {1,2,3,4,5,0,0,-4,-3,-2,9,6,-9,0};
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i] == 0){
				zero++;
			}
			
			if(arr[i] > 0){
				positive++;
			}
		  if (arr[i] < 0) {
			  negative--; 
		   }
			
		}
		 System.out.println("the negative count is " +negative);
		 System.out.println( "the positive count is " +positive);	
		 System.out.println( "the zero count is " +zero);	
	}
}
