package AllPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindTwoSumHashMap {

	public static void main(String[] args) {
		int[] array = {2,4,1,5,6,7,3,4};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int target = 9;
		
		for(int i = 0;i<array.length;i++) {
			int a = target- array[i];
			if(map.containsKey(a)) {
				System.out.println(map.get(a) + " "+i);
				//return;   //use return when u only want to print first two numbers whose sum is 9
			}else {	
				map.put(array[i], i);
			}
		}
		
	}
}
