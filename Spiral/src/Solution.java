import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int top = 0;
		int bottom = a.size() - 1;
		int left = 0;
		int right = a.get(0).size() - 1;

		int dir = 0;
		while (top <= bottom && right >= left) {
			if (dir == 0) {
				for (int i = left; i <= right; i++)
					result.add(a.get(top).get(i));
				top++;
				if(top< a.size())
				dir = 1;
			}
			if (dir == 1) {
				for (int i = top; i <= bottom; i++) {
					result.add(a.get(i).get(right));

				}
				right--;
				if(right >= 0)
				dir = 2;
			}
			if (dir == 2) {
				for (int i = right; i >= left; i--) {
					result.add(a.get(bottom).get(i));

				}
				bottom--;
				if(bottom>= 0)
				dir = 3;
			}
			if (dir == 3) {
				for (int i = bottom; i >= top; i--) {
					result.add(a.get(i).get(left));

				}
				left++;
				if(left< a.get(0).size())
				dir = 0;
			}
		}

		// Populate result;
		return result;
	}
	
	public static void main(String args[])
	{
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		row1.add(2);
		a.add(row1);
		
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		row2.add(3);
		row2.add(4);
		a.add(row2);
		
		ArrayList<Integer> row3 = new ArrayList<Integer>();
		row3.add(5);
		row3.add(6);
		a.add(row3);
		
		
		/*ArrayList<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		a.add(row1);
		
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		row2.add(2);
		a.add(row2);
		
		ArrayList<Integer> row3 = new ArrayList<Integer>();
		row3.add(5);
		a.add(row3);*/
		
		/*ArrayList<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		row1.add(2);
		a.add(row1);*/
		
		
		spiralOrder(a);
		
	}
}
