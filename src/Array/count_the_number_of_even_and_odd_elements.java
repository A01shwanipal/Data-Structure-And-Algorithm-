package Array;

public class count_the_number_of_even_and_odd_elements {

	public static void main(String [] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i] %2 == 0) {
				even++;
			}
			else {
				odd++;
			}
			
		}
		System.out.println("the Odd count is "+odd);
		System.out.println("the even count is "+even);	
	}
}
