package AllPrograms;

import java.util.HashMap;
import java.util.Map;

public class DupElemInArray {

	public static void main(String[] args) {
		int[] array = {1,2,4,6,7,3,45,56,6,5,5,5,4,4,4,8,6};
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : array) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
//		for(int num : array) {
//			if(map.containsKey(num)) {
//				map.put(num, map.get(num)+1);
//			}
//			else {
//				map.put(num, 1);
//			}
//		}	
		System.out.println("Duplicate elements are : ");
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			if(e.getValue()>1)
			System.out.println(e.getKey()+ " is repeated "+e.getValue()+ " times");
		}
	}

}
