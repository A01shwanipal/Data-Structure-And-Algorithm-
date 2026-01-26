package Array;

import java.util.Arrays;

public class WAP_to_delete_an_element_at_a_specified_position_in_a_given {

	public static void main(String [] args) {
		
	int[] arr = {1,2,3,4,5,6,7};
	int index  = 4;
	
	 int[] newArr = new int[arr.length - 1];
	
	
	
	
	// copy elements except the index
    for (int i = 0, j = 0; i < arr.length; i++) {
        if (i == index) continue;
        newArr[j++] = arr[i];
    }

    System.out.println("Original Array: " + Arrays.toString(arr));
    System.out.println("After Deletion: " + Arrays.toString(newArr));
	
	
}
}
