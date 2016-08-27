package staticBlock;

public class StaticBlock extends ClassLoader {
	
	static
	{	  
		System.out.println("I am in static block");
		System.exit(0);
		}
	
	
	public static void main(String args[])
	{
		//System.out.println("hello");
	}

}
