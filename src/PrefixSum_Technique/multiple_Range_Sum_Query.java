package PrefixSum_Technique;

public class multiple_Range_Sum_Query {
	
	public static void main(String args []) {
		
	int[] arr = {2,4,6,8,10};
	
	int[][] queries = {{1,3}, {0,4}, {2,2}};
    
	int[] prefix = new int[arr.length];
	
	
	prefix[0] = arr[0];
	
	for(int i = 1; i<arr.length;i++) {
		prefix[i] = prefix[i-1] + arr[i];
	}
	
	
	
	
	for(int q = 0; q<queries.length; q++) {
		int L = queries[q][0];
		int R = queries[q][1];
		
		
		int sum = 0;
		if(L ==0) {
			
			sum = prefix[R];
		}
		
		else {
			sum = prefix[R] - prefix[L-1];
		}
		System.out.println(sum);
	}

}
}
