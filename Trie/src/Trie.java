

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode(' ');
	}

	public void insert(int i) {
		TrieNode current = root;
		char[] bin = Integer.toBinaryString(i).toCharArray();
		for (char ch : bin) {
			TrieNode child = current.subNode(ch);
			if (child != null)
				current = child;
			else {
				current.childlist.add(new TrieNode(ch));
				current.count++;
				current = current.subNode(ch);
			}
		}
		current.isEnd = true;
	}
	
	public boolean search(int i)
	{
		TrieNode current = root;
		char[] bin = Integer.toBinaryString(i).toCharArray();
		for(char ch:bin)
		{
			TrieNode child = current.subNode(ch);
			if(child== null)
				return false;
			else
				current = current.subNode(ch);
		}
		if(current.isEnd ==  true)
		return true;
	return false;
	
	}
	
	public void remove(int i)
	{
		TrieNode current = root;
		char[] bin = Integer.toBinaryString(i).toCharArray();
		if(search(i)== false)
			return;
		
		for(char ch:bin)
		{
			TrieNode child = current.subNode(ch);
			if(child != null && current.count == 1)
			{
			current.childlist.remove(ch);
			return;
			}
			else
			{
				current.count--;
				current.childlist.remove(ch);
				current = child;
			}
			
		}
		
		current.isEnd = false;
		
	}
	
	
}
