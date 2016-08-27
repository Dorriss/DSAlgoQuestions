import java.util.ArrayList;

public class Node {
	
	int data;
	ArrayList<Node> child;
	Node left;
	Node right;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ArrayList<Node> getChild() {
		return child;
	}
	public void setChild(ArrayList<Node> child) {
		this.child = child;
	}
	
	public Node(int data)
	{
		this.data = data;
	}
	

}
