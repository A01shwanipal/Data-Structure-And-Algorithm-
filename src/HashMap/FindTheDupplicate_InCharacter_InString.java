package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindTheDupplicate_InCharacter_InString {

	public static void main(String[] args) {

		String str = "ashwani";
		Map<Character, Integer> map = new HashMap<>();

		boolean flag = false;

		for (int i = 0; i < str.length(); i++) {

			char key = str.charAt(i);

			if (map.containsKey(key)) {

				int count = map.get(key);
				map.put(key, count + 1);
				break;
			}

			else {
				map.put(key, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " duplicate character: " + entry.getValue());
				flag = true;
			}
		}

		if (!flag)
			System.out.println("Not Found Dupplicate");

	}
}
