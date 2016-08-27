import java.util.LinkedList;

public class TrieNode {
	
	char data;
	boolean isEnd;
	int count;
	LinkedList<TrieNode> childlist;
	
	public TrieNode(char i)
	{
		data =i;
		count=0;
		isEnd=false;
		childlist = new LinkedList<TrieNode>();
	}

	public TrieNode subNode(char i)
	{
		
		if(childlist != null)
			for(TrieNode chil:childlist)
			{
				if(chil.data == i)
					return chil;
			}
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
