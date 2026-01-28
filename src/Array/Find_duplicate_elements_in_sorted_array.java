package Array;

public class Find_duplicate_elements_in_sorted_array {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,4,2,3};
		
		boolean status  = false;
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = i+1; j < arr.length;j++) {
				
				if(arr[i] == arr[j]) {
					status = true;
					System.out.println("the duplicate elemenet is found");
					return;
				}
			}
		}
		
		
		if(!status) {
			System.out.println("the duplicate elemenet is  not found");
		}
	}
}
