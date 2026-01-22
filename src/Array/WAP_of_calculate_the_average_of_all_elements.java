package Array;

public class WAP_of_calculate_the_average_of_all_elements {

	public static void main(String [] args) {
	int[] arr = {1,2,3};
	int sum = 0;
	int avg  = 0;
	int total_count = 0;
	
	
	
	for(int i = 0;i<arr.length;i++) {
		sum = sum+arr[i];
		total_count++;
		}
	//System.out.println(sum);	
	//System.out.println(total_count);	
	System.out.println( "the avg is :"+sum/total_count);	
}
}
