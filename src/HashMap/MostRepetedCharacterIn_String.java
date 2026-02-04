package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MostRepetedCharacterIn_String {

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
		
		
		int maxcount = 0;
		char maxchr = ' ';
		
       for(int i = 0; i<str.length();i++) {
			
			char key = str.charAt(i);
			
			if(map.get(key) > maxcount) {
				maxchr = key;
				maxcount = map.get(key);
			}
       }
       
       System.out.println("maximum repeated character is "+maxchr+" ("+maxcount+" times)");
		
}
}
