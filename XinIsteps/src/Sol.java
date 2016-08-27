
public class Sol {

	
public	boolean find(int X,int I)
{
	//boolean possible =false;
	
	if(I==0 && X==0)
		return true;
	if(I==1 && (X==1|| X==-1))
	{
		return true;
	}
	
	if(X>0)
		return find(X-I,I-1);
	if(X<0)
		return find(X+I,I-1);
	
	return false;
	}
public static void main(String args[])
{
	System.out.println(new Sol().find(3,2));;
	
}


}



