package Array;

public class fine_the_taget_sum_in_arra {

	
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,5};
		int sum = 4;
		boolean status = false;
		
		
	for(int i = 0; i<arr.length; i++) {
			
	 for(int j = 0; j<arr.length;j++) {
		 
			if(arr[i]+ arr[j] == sum) {
				status = true;
				System.out.println("sum is index :" + i +" And " + j);
				return;
			}
	      }
			
		}
	
	if(!status) {
		
		System.out.println("sum is  not found");
	}
	
			
		}	
}
