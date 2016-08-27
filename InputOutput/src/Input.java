import java.util.Scanner;

public class Input {
	 public static void main(String[] args) {
	        // Write your code here
	        Scanner scin = new Scanner(System.in);
	        while(scin.hasNext())
	        {
	        int a = scin.nextInt();
	       if(a!=11)
	        System.out.println(a);
	       else break;
	        
	        }
	        scin.close();
	           
	    }

}
