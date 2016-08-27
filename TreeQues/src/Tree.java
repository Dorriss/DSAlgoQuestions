import java.util.ArrayList;

public class Tree {
	Node root=null;
	
	public Node InsertChild(int data,Node node)
	{
		ArrayList<Node> children = node.getChild();
		Node newnode = new Node(data);
		children.add(newnode);
		return node;
		
	}
	public Node createTree(int data)
	{
		Node root = new Node(data);
		return root;
		
	}
	

}
