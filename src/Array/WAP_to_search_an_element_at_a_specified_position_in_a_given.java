package Array;

public class WAP_to_search_an_element_at_a_specified_position_in_a_given {

	public static void main(String [] args) {
		
	int[] arr = {1,2,3,4,5,6,7};
	
	int value = 1;
	
	for(int i = 0;i<arr.length;i++) {
		
		if(arr[i] == value) {	
	 	    System.out.print("the element found at : " +i+" ");	
	 	    return;
		}
		
		else {
			 System.out.print("the element not found");
			 return;
		}
		 }
	
}
}
