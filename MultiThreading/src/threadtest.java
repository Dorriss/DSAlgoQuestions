
public class threadtest extends Thread {

	static int n = 0;
	

	synchronized void print(String tname)
	{
		
		
		while(n<=10)
		{
			System.out.println(tname  + " " + n);
			n++;
		}
		
	}
	
	public void run()
	{
		threadtest t1 = new threadtest();
		print(t1.getName());
		
		
	}
	
	public static void main(String args[])
	{
		threadtest t1 = new threadtest();
		threadtest t2 = new threadtest();
		t1.start();
		t2.start();
	}
}
