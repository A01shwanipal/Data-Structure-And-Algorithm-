package Array;

public class move_all_zeros_to_the_end {
	
	public static void main(String[] args) {
		
		int arr[] = {0,4,5,3,0,3,2,0,9,5,6};
		
		int newarr[] = new int[arr.length];
		int index = 0;
		
		for(int i = 0; i<arr.length;i++) {
			
			if(arr[i] != 0) {
				
				newarr[index++] = arr[i];
			}
		}
		
		
		for(int no :newarr) {
			System.out.print(no + " ");
		}

	}

}
