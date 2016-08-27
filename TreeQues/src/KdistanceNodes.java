// Java program to print all nodes at a distance k from given node
// A binary tree node
class Node1 {

	int data;
	Node1 left, right;

	Node1(int item) {
		data = item;
		left = right = null;
	}
}

class BinaryTree {

	static Node1 root;
	/* Recursive function to print all the nodes at distance k in the
	tree (or subtree) rooted with given root. See */

	void printkdistanceNodeChild(Node1 node, int k) {
		// Base Case
		if (node == null || k < 0) {
			return;
		}

		// If we reach a k distant node, print it
		if (k == 0) {
			System.out.print(node.data);
			System.out.println("");
			return;
		}

		// Recur for left and right subtrees
		printkdistanceNodeChild(node.left, k - 1);
		printkdistanceNodeChild(node.right, k - 1);
	}

	// Prints all nodes at distance k from a given target node.
	// The k distant nodes may be upward or downward. This function
	// Returns distance of root from target node, it returns -1 if target
	// node is not present in tree rooted with root.
	int printkdistanceNode(Node1 node, Node1 target, int k) {
		
		// Base Case 1: If tree is empty, return -1
		if (node == null) {
			return -1;
		}

		// If target is same as root. Use the downward function
		// to print all nodes at distance k in subtree rooted with
		// target or root
		if (node == target) {
			printkdistanceNodeChild(node, k);
			return 0;
		}

		// Recur for left subtree
		int dl = printkdistanceNode(node.left, target, k);

		// Check if target node was found in left subtree
		if (dl != -1) {
			
			// If root is at distance k from target, print root
			// Note that dl is Distance of root's left child from target
			if (dl + 1 == k) {
				System.out.print(node.data);
				System.out.println("");
			}
			
			// Else go to right subtree and print all k-dl-2 distant nodes
			// Note that the right child is 2 edges away from left child
			else {
				printkdistanceNodeChild(node.right, k - dl - 2);
			}

			// Add 1 to the distance and return value for parent calls
			return 1 + dl;
		}

		// MIRROR OF ABOVE CODE FOR RIGHT SUBTREE
		// Note that we reach here only when node was not found in left subtree
		int dr = printkdistanceNode(node.right, target, k);
		if (dr != -1) {
			if (dr + 1 == k) {
				System.out.print(node.data);
				System.out.println("");
			} else {
				printkdistanceNodeChild(node.left, k - dr - 2);
			}
			return 1 + dr;
		}

		// If target was neither present in left nor in right subtree
		return -1;
	}

	// Driver program to test the above functions
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();

		/* Let us construct the tree shown in above diagram */
		tree.root = new Node1(20);
		tree.root.left = new Node1(8);
		tree.root.right = new Node1(22);
		tree.root.left.left = new Node1(4);
		tree.root.left.left.left = new Node1(3);
		tree.root.left.left.right = new Node1(5);
		tree.root.left.right = new Node1(12);
		tree.root.left.right.left = new Node1(10);
		tree.root.left.right.left.left = new Node1(11);
		tree.root.left.right.left.right = new Node1(13);
		tree.root.left.right.right = new Node1(14);
		//Node1 target = tree.root.left;
		Node1 target = tree.root.left.right;
		tree.printkdistanceNode(root, target, 2);
	}
}

// This code has been contributed by Mayank Jaiswal
