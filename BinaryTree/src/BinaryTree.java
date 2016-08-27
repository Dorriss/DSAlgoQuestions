import java.util.ArrayList;

// Java program to print binary tree in reverse order

// A binary tree node
class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}

	Node() {
	}
}

class Values {
	int max, min;
}

class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
		//ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int max = a.size();
		/*if(max/2 == 0)
			max= max/2;
		else
			max = (max+1)/2+1;
			*/
		
		for (int i = 0; i < max; i++) {
			ArrayList<Integer> ar = new ArrayList<>();
			for (int j = i; j < max; j++) {

				//ar.add(a.get(a.get(i).size() - j - 1).get(i));
				
				int temp = a.get(i).get(j);
				a.get(i).set(j, a.get(j).get(i));
				a.get(j).set(i, temp);

			}
		}
int col = a.get(0).size();
for(int i=0;i<max;i++)
{
	for (int j = 0; j < col/2; j++) {
	int temp = a.get(i).get(j);
	a.get(i).set(j, a.get(i).get(a.get(i).size()-j-1));
	a.get(i).set(a.get(i).size()-j-1,temp);
	
	}
	
}
	}
}

class BinaryTree {

	Node root;
	Values val = new Values();

	// A utility function to find min and max distances with respect
	// to root.
	void findMinMax(Node node, Values min, Values max, int hd) {

		// Base case
		if (node == null)
			return;

		// Update min and max
		if (hd < min.min)
			min.min = hd;
		else if (hd > max.max)
			max.max = hd;

		// Recur for left and right subtrees
		findMinMax(node.left, min, max, hd - 1);
		findMinMax(node.right, min, max, hd + 1);
	}

	// A utility function to print all nodes on a given line_no.
	// hd is horizontal distance of current node with respect to root.
	void printVerticalLine(Node node, int line_no, int hd) {

		// Base case
		if (node == null)
			return;

		// If this node is on the given line number
		if (hd == line_no)
			System.out.print(node.data + " ");

		// Recur for left and right subtrees
		printVerticalLine(node.left, line_no, hd - 1);
		printVerticalLine(node.right, line_no, hd + 1);
	}

	// The main function that prints a given binary tree in
	// vertical order
	void verticalOrder(Node node) {

		// Find min and max distances with resepect to root
		findMinMax(node, val, val, 0);

		// Iterate through all possible vertical lines starting
		// from the leftmost line and print nodes line by line
		for (int line_no = val.min; line_no <= val.max; line_no++) {
			printVerticalLine(node, line_no, 0);
			System.out.println("");
		}
	}

	public static void main(String args[]) {
		Solution sol = new Solution();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();
		
		
		a.add(31);
		a.add(32);
		a.add(228);
		a.add(333);
		//a.add(3);
		//a.addAll(31,31);

		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		
		c.add(27);
		c.add(8);
	c.add(9);	
	c.add(10);
	
	d.add(17);
	d.add(18);
d.add(19);	
d.add(20);
		

		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		sol.rotate(list);

	}

	// Driver program to test the above functions

	/*
	 * public static void main(String args[]) { BinaryTree tree = new
	 * BinaryTree();
	 * 
	 * Let us construct the tree shown in above diagram tree.root = new Node(1);
	 * tree.root.left = new Node(2); tree.root.right = new Node(3);
	 * tree.root.left.left = new Node(4); tree.root.left.right = new Node(5);
	 * tree.root.right.left = new Node(6); tree.root.right.right = new Node(7);
	 * tree.root.right.left.right = new Node(8); tree.root.right.right.right =
	 * new Node(9);
	 * 
	 * System.out.println("vertical order traversal is :");
	 * tree.verticalOrder(root); }
	 */
}

// This code has been contributed by Mayank Jaiswal
