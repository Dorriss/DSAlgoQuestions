
public class Solution {

	public static void main(String args[]) {
		/*
		 * char[][] input = { { '.', '.', 'B', '.', '.' }, { '.', '.', 'G', 'R',
		 * 'R' }, { '.', '.', 'B', '.', '.' }, { 'R', '.', '.', '.', '.' }, {
		 * 'R', '.', '.', '.', '.' } };
		 */

		char[][] input = { { 'G', '.', 'R', '.', '.' }, { '.', '.', 'G', 'G', 'B' }, { '.', '.', 'R', '.', '.' },
				{ 'B', '.', '.', '.', '.' }, { 'B', '.', '.', '.', '.' } };

		int r = input.length;
		int c = input[0].length;
		int res = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				if (input[i][j] == 'G') {
					res = res + 1;
					input[i][j] = 'B';
					for (int k = i + 1; k < r; k++) {
						if (input[k][j] == 'R') {
							input[k][j] = '.';
						} else
							break;
					}
				}

				if (input[i][j] == 'B') {
					res = res + 1;
					input[i][j] ='.';
					for (int k = j+1; k < c; k++) {
						
						if (input[i][k] == 'B') {
							input[i][k] = '.';
						}
						if (input[i][k] == 'G') {
							input[i][k] = 'R';
						}

						else
							break;
					}

				}

				if (input[i][j] == 'R') {
					res = res + 1;
					input[i][j] = '.';
					for (int k = i+1; k < r; k++) {
						//input[k][j] = '.';
						if (input[k][j] == 'R') {
							input[k][j] = '.';
						} 
						if (input[k][j] == 'G') {
							input[k][j] = 'B';
						}
						else
							break;
					}

				}
			}

		}
		System.out.println(res);
	}
}
