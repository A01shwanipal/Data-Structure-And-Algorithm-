package Array;

public class WAP_to_insert_an_element_at_a_specified_position_in_a_given {

	public static void main(String [] args) {
		
	int[] arr = {1,2,3,4,5,6,7};
	int index  = 4;
	int value = 80;
	
	for(int i = 0;i<arr.length;i++) {
		
		if(i == index) {	
	    arr[index] =  value;
		}
		
		}
	
	System.out.print("[");	
	for(int n :arr) {
		
		System.out.print(n+" ");	
	}
	
	System.out.print("]");	
}
}
