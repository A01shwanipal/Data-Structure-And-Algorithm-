package Array;

public class WAP_to_copy_the_contents_of_one_array_into_another_array {
	
	public static void main(String [] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int[] newarr = new int[arr.length];
		
		
		
		
		
		for(int i = 0;i<arr.length;i++) {
			newarr[i] = arr[i];
			}
		
		System.out.print("[");	
		for(int n :newarr) {
			
			System.out.print(n+" ");	
		}
		
		System.out.print("]");	
		
}
}
