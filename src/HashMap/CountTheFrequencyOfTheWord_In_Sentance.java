package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfTheWord_In_Sentance {
	public static void main(String [] args) {
		
		String str = "This is first demo i will create first java demo program";
		
		String[]words = str.split(" ");
		
		Map<String,Integer> map = new HashMap<>();
		
		for(int i = 0; i<words.length;i++) {
			
			String word = words[i];
			
			if(map.containsKey(word)) {
				
				 int count = map.get(word);
				 count++;
				 map.put(word, count);
				
			}
			else {
				map.put(word, 1);
			}
		}
		System.out.println(map);

	
	}

}
