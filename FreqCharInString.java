package AllPrograms;

import java.util.HashMap;
import java.util.Map;

public class FreqCharInString {

	public static void main(String[] args) {
		String s1 = "abbacdaeddacbba";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}

		
		char mostFreqChar = '0';
		int maxCount = 0;
		for(Map.Entry<Character, Integer> e : map.entrySet()) {
//			if(e.getValue()>1) {
//			System.out.println(e.getKey()+ " character repeated " +e.getValue()+ " times");
//			}
			if(e.getValue()>maxCount) {
				mostFreqChar = e.getKey();
				maxCount = e.getValue();
			}
		}
		System.out.println("The character " +mostFreqChar+ " repeated " +maxCount+ " times");
	}

}
