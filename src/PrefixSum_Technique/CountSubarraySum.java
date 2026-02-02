package PrefixSum_Technique;

public class CountSubarraySum {
	
	public static void main(String args []) {
		
		int[] arr = {3,4,2,1,6};
		int k = 7;
		int[] prefix = new int[arr.length];
		
		
		prefix[0] = arr[0];
		
		for(int i = 1; i<arr.length;i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		
		int count = 0;
		
		
       for(int i = 0; i<arr.length; i++) {
			
			for(int j = 0; j<arr.length; j++) {
				
				int sum = 0;
				if( i==0) {
					
					sum = prefix[j];
				}
				
				else {
					sum = prefix[j] - prefix[i-1];
				}
				
				if(sum==k) {
					count++;
				}
			}
			}
       
            System.out.println(count);
      
		
	}
}

