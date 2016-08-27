import java.util.Scanner;

public class Players {
	String Playername;


	public String getPlayername() {
		return Playername;
	}

	public void setPlayername(String playername) {
		Playername = playername;
	}
	public Turn playturn(String s)
	{
		System.out.println(s);
		Scanner scin  = new Scanner(System.in);
		Turn  t= new Turn();
		t.i = scin.nextInt();
		t.j =scin.nextInt();
		
		return t;
 	}

}
