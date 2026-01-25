package Array;

public class WAP_to_find_the_kth_largest_or_smallest_element_in_an_array {

	
	public static void main(String[] args) {
		
		int arr[] = {3, 3, 4, 9, 0};
        int k = 2;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }

            if (count == k - 1) {
                System.out.println(k + "th largest element is: " + arr[i]);
                break;
            }
        }
		
	}
	
}
