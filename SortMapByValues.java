package AllPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValues {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 5);
		map.put("B", 2);
		map.put("C", 1);
		map.put("D", 3);
		
		System.out.println("Before sorting by values : " +map);
		
		map = sortByValues(map);
		System.out.println("After Sorting by values : " +map);

	}

	private static Map<String, Integer> sortByValues(Map<String, Integer> map) {
		
		Map<String, Integer> sortByValue = new LinkedHashMap<>();
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		List<Entry<String, Integer>> list = new ArrayList<>(entrySet);
		
		list.sort((x,y)-> x.getValue().compareTo(y.getValue()));
		
		for(Entry<String, Integer> e : list) {
			sortByValue.put(e.getKey(), e.getValue());
		}
		
	  return sortByValue;
	}

}
