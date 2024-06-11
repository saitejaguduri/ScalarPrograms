package AllPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval{
	int start;
	int end;
	
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}
public class MergeIntervals {

	public static void main(String[] args) {
		
		List<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(1,7));
		list.add(new Interval(2,6));
		list.add(new Interval(7,10));
		list.add(new Interval(11,15));
		
		List<Interval> mergeIntervals = mergeIntervals(list);

		for(Interval interval : mergeIntervals) {
			System.out.println("[" +interval.start+ "," +interval.end+"]");
		}
		
	}

	private static List<Interval> mergeIntervals(List<Interval> list) {
		
		if(list == null || list.size()<=1) {
			return list;
		}
		//Collections.sort(list,(x,y)->Integer.compare(x.start, y.start));
		list.sort(Comparator.comparingInt(x->x.start));
		List<Interval> mergedList = new ArrayList<Interval>();
		Interval current = list.get(0);
		
		for(int i=0; i<list.size();i++) {
			Interval next = list.get(i);
			if(current.end>=next.start) {
				current.end = Math.max(current.end, next.end);
			}
			else {
				mergedList.add(current);
				current = next;
			}
		}
		mergedList.add(current);
		
		return mergedList;
	}

}
