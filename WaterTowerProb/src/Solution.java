
public class Solution {
	
	
	public void Sol1D(int[] input)
	{
		int n = input.length;
		int[] left = new int[n];
		int[] right = new int[n];
		
		int tempmax = 0;
		 for(int i=0;i<n;i++)
		 {
			 if(input[i]<tempmax)
				 left[i]=tempmax;
			 else
			 {
				 left[i]=input[i];
				 tempmax=input[i];
			 }
		 }
		 tempmax=0;
		 for(int i=n-1;i>=0;i--)
		 {
			 if(input[i]<tempmax)
				 right[i]=tempmax;
			 else
			 {
				 right[i]=input[i];
			 tempmax=input[i];
			 }
		 }
		 
		 int result =0;
		for(int i=0;i<n;i++)
		{
			result = result +(Math.min(left[i], right[i])-input[i]);
		}
		
		System.out.println(result);

	}
	
	
public void Sol2D(int[][] input)
{

	int m = input.length;
	int n = input[0].length;
	int[][] left = new int[m][n];
	int[][] right = new int[m][n];
	int[][] top = new int[m][n];
	int[][] bottom = new int[m][n];
	
	
	int tempmax = 0;
	 for(int i=0;i<m;i++)
	 {
		 for(int j=0;j<n;j++)
		 {
			 if(input[i][j]<tempmax)
				 left[i][j]=tempmax;
			 else
			 {
				 left[i][j]=input[i][j];
				 tempmax=input[i][j];
			 }
		 }
		
	 }
	 
	 tempmax=0;
	 for(int i=0;i<m;i++)
	 {
		 for(int j=n-1;j>=0;j--)
		 {
			
		 if(input[i][j]<tempmax)
			 right[i][j]=tempmax;
		 else
		 {
			 right[i][j]=input[i][j];
		 tempmax=input[i][j];
		 }
		 }
	 }
	 
	  tempmax = 0;
	 
	 for(int i=m-1;i>=0;i--)
	 {
		 for(int j=n-1;j>=0;j--)
		 {
			
		 if(input[i][j]<tempmax)
			 bottom[i][j]=tempmax;
		 else
		 {
			 bottom[i][j]=input[i][j];
		 tempmax=input[i][j];
		 }
		 }
	 }
	 
 tempmax = 0;
	 
	 for(int i=m-1;i>=0;i--)
	 {
		 for(int j=0;j<n;j++)
		 {
			
		 if(input[i][j]<tempmax)
			 top[i][j]=tempmax;
		 else
		 {
			 top[i][j]=input[i][j];
		 tempmax=input[i][j];
		 }
		 }
	 }
	
	 int result =0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			result = result + Math.min(Math.min(left[i][j], right[i][j]),Math.min(top[i][j],bottom[i][j]))-input[i][j];
			}
		}
		
		System.out.println(result); 
	 
}
	
	public static void main(String args[])
	{
		int[] input = {5,3,7,2,6,4,5,9,1,2};
		
			}

}
