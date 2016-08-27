import java.util.ArrayList;
import java.util.Scanner;

class location{
	int i,j;
}

public class Solution {
	
public static void main(String[] args){
	
	int m=4;
	int n=4;
	//char[][] input = new char[m][n];
	
	char[][] input ={ {'T','U','B','U'},{'U','C','U','C'},{'U','B','U','U'},{'C','B','J','C'}};
	

	
	findAllPairShortest(input);
//	shortest(startm,startn,endm,endn);
}

private static void shortest(int startm, int startn, int endm, int endn) {
	// TODO Auto-generated method stub
	
}

private static void findAllPairShortest(char[][] input) {
	ArrayList<location> cheeselocations = new ArrayList<location>();
	location l = new location();
	l.i=1;l.j=1;
	cheeselocations.add(l);
	l.i=1;
	l.j=2;
	cheeselocations.add(l);
			
	
}


}
