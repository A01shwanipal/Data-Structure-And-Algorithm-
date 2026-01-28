package Array;

public class find_the_missing_number_in_array {

	public static void main(String[] args) {
		
	
	int[] arr = {1,2,3,5};
	
	int n = arr.length +1;
	
	// the sum n number
	
	int sum = n*(n+1)/2;
	
	int arrsum = 0;
	
	for(int i = 0; i<arr.length; i++) {
		arrsum = arrsum+arr[i];
	}
	
	
	
	int missing_number = sum-arrsum;
	
	System.out.println(missing_number);
	
			
}
}
