package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindTheDupplicate_numbner_InArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,4,4,4,0,0,0,0,0,0};
		
		Map<Integer, Integer> map = new HashMap<>();

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			int key = arr[i];

			if (map.containsKey(key)) {

				int count = map.get(key);
				map.put(key, count + 1);
				//break;
			}

			else {
				map.put(key, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " duplicate character: " + entry.getValue());
				flag = true;
			}
		}

		if (!flag)
			System.out.println("Not Found Dupplicate");

	}
}
