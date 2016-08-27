
public class Board {
	
	int[][] mat;

	public int[][] getMat() {
		return mat;
	}

	public void setMat(int N) {
		this.mat = new int[N][N];
	}
	
	public boolean setcell(int i,int j)
	{
		
		if(mat[i][j] == 1)
			return false;
		else
		{
			mat[i][j]=1;
			printboard(mat);
		    return true;
		}
		
	}
	
	private void printboard(int[][] mat2) {
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				System.out.print(mat[i][j]+" " );
			}
			System.out.println("\n");
		}
		
	}

	public boolean checkforwin()
	{
		for(int i=0;i<mat.length;i++)
		{
			int countrow = mat[i].length;
			int countcol = mat[i].length;
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]==1)
					countrow--;
				if(mat[j][i]==1)
				{
					countcol--;
				}
			}
			if(countrow == 0 || countcol ==0)
			{
			 return true;
			}			
		}
		int diaglr = mat.length;
		int diagrl = mat.length;
		for(int i=0;i<mat.length;i++)
		{
		
		if(mat[i][i] == 1)
			diaglr--;
		if(mat[i][mat.length-i-1] == 1)
			diagrl--;		
		}
		if(diaglr == 0 || diagrl == 0)
			return true;
		
		return false;
		
	}
	

}
