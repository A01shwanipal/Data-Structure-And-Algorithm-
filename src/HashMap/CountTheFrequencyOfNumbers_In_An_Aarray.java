package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfNumbers_In_An_Aarray {

public static void main(String [] args) {

		
	int[] arr = {1,2,3,4,3,2,5,6,5,7,7,9,0,0,0,12,34,54};
	
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i<arr.length;i++) {
			
			int key = arr[i];
			if(map.containsKey(key)) {
				
				 int count = map.get(key);
				 count++;
				 map.put(key, count);
				
			}
			else {
				map.put(key, 1);
			}
		}
		System.out.println(map);

	
	}
}
