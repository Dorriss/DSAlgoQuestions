import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelOrderReverse {
	
	public static void main(String args[])
	{
		ArrayList<Node> child = new ArrayList<Node>();
		ArrayList<Node> child1 = new ArrayList<Node>();
		ArrayList<Node> child2 = new ArrayList<Node>();
		Tree tr = new Tree();
		Node root =tr.createTree(1);
		child.add(new Node(2));
		child.add(new Node(3));
		//root.child = child;
		root.setChild(child);
		
	//	child.clear();
		
		child1.add(new Node(4));
		child1.add(new Node(5));
		root.child.get(0).setChild(child1);
		
	//	child.clear();
		
		child2.add(new Node(6));
		child2.add(new Node(7));
		root.child.get(1).setChild(child2);
		
		levelOrderReverse(root);
		
		
		
	}
	
	public static void levelOrderReverse(Node root)
	{
		if(root==null)
			return;
		LinkedList<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			int size = q.size();
			Node element = q.removeLast();
			if(element.getChild() != null)
			{
		    ArrayList<Node> children= element.child;
		    for(int i=children.size()-1;i>=0;i--)
		    {
		    	q.addFirst(children.get(i));
		    }
			}
		    System.out.println(element.data);
		}
		
		
	}

}
