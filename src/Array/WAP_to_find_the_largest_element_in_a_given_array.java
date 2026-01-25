package Array;

public class WAP_to_find_the_largest_element_in_a_given_array {

	public static void main(String [] args) {
		
		int[] arr = {90,22,3,4,5};
		 int max = Integer.MIN_VALUE;
		
		
		for(int i = 0;i<arr.length;i++)
		if(arr[i]> max) {
			max = arr[i];
		}
		 System.out.println(max);	
	}
	
}
