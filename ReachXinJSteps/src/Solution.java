import java.util.ArrayList;

public class Solution {
	
	public static void main(String args[])
	{
		Solution a = new Solution();
		
		//int n = a.checksteps(0, 3, 0);
		//System.out.println(n); 
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(0, 2);
		list.add(3);
		
	}
	
	
	
	



	public int checksteps(int initial,int X,int J)
	{
		int result = Integer.MAX_VALUE;

		if(initial == X)
			return J;
	
	
	//	int n1 = checksteps(X,X+J+1,J+1) + 1;
	//	int n2 = checksteps(X+J,J-1) + 1;
		
	//	result =Math.min(n1, n2);
		
		
		return result;
		
	}

}
