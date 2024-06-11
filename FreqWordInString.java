package AllPrograms;

import java.util.HashMap;
import java.util.Map;

public class FreqWordInString {

	public static void main(String[] args) {
		String s1 = "The quick brown frog Jumps. jumps @jumps over the lazy dog";
		Map<String, Integer> map = new HashMap<String, Integer>();
		s1 = s1.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");
		String[] s2 = s1.split(" ");
        for(String word : s2) {
        	map.put(word, map.getOrDefault(word, 0)+1);
        }
        
        String mostFreqWord = "\0";
        int maxCount = 0;
        for(Map.Entry<String, Integer> e : map.entrySet()) {
           if(e.getValue()>1) {
        	   mostFreqWord = e.getKey();
        	   maxCount = e.getValue();
        	   }
        }
        System.out.println("The word \'"+mostFreqWord+ "\' is repeated "+maxCount+ " times");
	}

}
