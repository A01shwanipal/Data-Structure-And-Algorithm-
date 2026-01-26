package Array;

import java.util.Arrays;

public class WAP_to_sort_an_array_elements_in_ascending_or_descending_order {
	
	public static void main(String [] args) {
		

		  int[] arr = {5, 2, 9, 1, 7, 3};

	        // Ascending sort
	        int[] asc = arr.clone();
	        for (int i = 0; i < asc.length; i++) {
	            for (int j = i + 1; j < asc.length; j++) {
	                if (asc[i] > asc[j]) {
	                    int temp = asc[i];
	                    asc[i] = asc[j];
	                    asc[j] = temp;
	                }
	            }
	        }

	        // Descending sort
	        int[] desc = arr.clone();
	        for (int i = 0; i < desc.length; i++) {
	            for (int j = i + 1; j < desc.length; j++) {
	                if (desc[i] < desc[j]) {
	                    int temp = desc[i];
	                    desc[i] = desc[j];
	                    desc[j] = temp;
	                }
	            }
	        }

	        System.out.println("Original  : " + Arrays.toString(arr));
	        System.out.println("Ascending : " + Arrays.toString(asc));
	        System.out.println("Descending: " + Arrays.toString(desc));
}
}
