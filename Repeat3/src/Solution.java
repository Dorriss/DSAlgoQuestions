import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	
	public static void main(String args[])
	{
		Solution sol = new Solution();
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(7);
		sol.repeatedNumber(a);
	}
	
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
		List<Integer> ints = new LinkedList<>();
		List<Integer> counts = new LinkedList<>();

		for (int i = 0; i < a.size(); i++) {
			if (ints.size() < 2 && !ints.contains(a.get(i))) {
				ints.add(a.get(i));
				counts.add(1);
			} else {
				if (ints.contains(a.get(i))) {
					int j = ints.indexOf(a.get(i));
					counts.set(j, counts.get(j) + 1);
				} else
				{
					for (int j = 0; j < counts.size(); j++) {
						if(counts.get(j) == 1)
						{
							ints.remove(j);
							counts.remove(j);
						}
						else
							counts.set(j, counts.get(j)-1);
						
					}					
				}

			}
		}
		int max = -1;
		int index = -1;
		for (int j = 0; j < counts.size(); j++) {
			if (counts.get(j) > max) {
				index = j;
				max = counts.get(j);
			}

		}
		if (index == -1 /*|| counts.get(index)<= a.size()/3*/) {
			System.out.println("no elemnt");
			return -1;
		} else {
			System.out.println(ints.get(index));
			return ints.get(index);
		}
	}
}
