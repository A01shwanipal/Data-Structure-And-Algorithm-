package Array;

public class calculate_the_sum_of_even_and_odd_numbers {
	
	public static void main(String [] args) {
		
	int[] arr = {1,2,3,4,5};
	int oddsum = 0;
	int evensum = 0;
	
	
	for(int i = 0;i<arr.length;i++) {
		
		if(arr[i] %2 == 0) {
			evensum = evensum +arr[i];
		}
		else {
			oddsum = oddsum+arr[i];
		}
		
	}
	 System.out.println("the odd sum is " +oddsum);
	 System.out.println( "the Even sum is " + evensum);	
}
}