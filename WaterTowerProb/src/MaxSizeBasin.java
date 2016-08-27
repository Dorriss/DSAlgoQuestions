import java.util.ArrayList;
import java.util.HashMap;

class List {
	int key;
	int value;
}

public class MaxSizeBasin {
	int[][] input;
	int row;
	int col;

	public int[][] getInput() {
		return input;
	}

	public void setInput(int[][] input) {
		this.input = input;
		this.row = input.length;
		this.col = input[0].length;
	}

	//int[][] newinput;
	// HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

/*	public int[][] getNewinput() {
		return newinput;
	}*/

	/*public void setNewinput() {
		this.newinput = new int[input.length][input[0].length];
	}*/

	public void calculate() {

		ArrayList<List> lst = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				if (input[i][j] != -1) {
					List elemnet = new List();
					elemnet.key = input[i][j];
					elemnet.value = process(i, j, input[i][j]);
					lst.add(elemnet);

				}
			}
		}
		List max = lst.get(0);
		for (int i = 1; i < lst.size(); i++) {
			if (lst.get(i).value > max.value) {
				max = lst.get(i);
			}

		}
		System.out.println(max.key);
	}

	public int process(int i, int j, int key) {

		int value = 0;
		if (input[i][j] != 0) {
			value = value + 1;
			  input[i][j] = -1;
			if (i < row - 1) {
				if (input[i + 1][j] == key) {
					value = value + process(i + 1, j, key);
				}
			}
			if (j < col - 1) {
				if (input[i][j + 1] == key) {
					value = value + process(i, j + 1, key);
				}
			}
			if (i >= 1) {
				if (input[i - 1][j] == key) {
					value = value + process(i - 1, j, key);
				}
			}
			if (j >= 1) {
				if (input[i][j - 1] == key) {
					value = value + process(i, j - 1, key);
				}
			}
		}
		return value;
	}

	public static void main(String args[]) {
		int[][] input = { { 9, 9, 9, 8, 7, 7 }, { 8, 8, 7, 7, 7, 8 }, { 8, 8, 8, 7, 7, 7 }, { 8, 8, 8, 9, 9, 9 },
				{ 8, 8, 8, 7, 7, 7 }, { 4, 4, 5, 5, 5, 5 }, { 5, 5, 5, 6, 6, 7 } };
		int[][] input1 = { {3,5,5},{5,4,5},{5,5,5}};
		

		MaxSizeBasin msb = new MaxSizeBasin();
		msb.setInput(input1);
		//msb.setNewinput();
		msb.calculate();
	}

}
