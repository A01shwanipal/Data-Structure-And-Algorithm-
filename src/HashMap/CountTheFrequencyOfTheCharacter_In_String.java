package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfTheCharacter_In_String {
	public static void main(String [] args) {
		
		String str = "ashwani";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				 int count = map.get(ch);
				 count++;
				 map.put(ch, count);
				
			}
			else {
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);
	}

}
