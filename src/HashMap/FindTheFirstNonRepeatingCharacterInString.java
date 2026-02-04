package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindTheFirstNonRepeatingCharacterInString {

	public static void main(String [] args) {
		
		String str = "Ashwani";
        Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i<str.length();i++) {
			
			char key = str.charAt(i);
			
			if(map.containsKey(key)) {
				 int count = map.get(key);
				 count++;
				 map.put(key, count);
				
			}
			else {
				map.put(key, 1);
			}
		}
		Boolean flag = false;
         for(int i = 0; i<str.length();i++) {
			
			char key = str.charAt(i);
			if(map.get(key) == 1) {
				
				 flag = true;
	                System.out.println("First non-repeated character is "+key);
	                break;

			}

         }
         
         if(!flag) {
        	 System.out.println("First non-repeated  is not found"); 
         }
	}
	
}
