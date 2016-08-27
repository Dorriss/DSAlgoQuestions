import java.util.Stack;

public class minmaxday {

	public static void main(String args[]) {
	//	minmaxday.minmax(new int[] { 5, 4, 3 });// ,0,1,8,2,-1,18,10});
		
		 int prices[] = {2, 5, 7, 1, 4, 3, 1, 3};
		 minmaxday.minmax(prices);
	}

	public static void minmax(int[] arr) {

		Stack<Integer> st = new Stack<Integer>();
		boolean increasing = false;
	//	boolean decreasing = false;
		st.push(arr[0]);
		if (arr[1] > arr[0]) {
			increasing = true;
		} else
			increasing = false;
		int i = 1;
		while (i < arr.length) {
			if ((arr[i] < st.peek() && increasing == true) || (arr[i] > st.peek() && increasing == false)) {
				st.push(arr[i]);

				increasing = !increasing;
			} else {
				st.pop();
				st.push(arr[i]);

			}
			i++;

		}

		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}

}
