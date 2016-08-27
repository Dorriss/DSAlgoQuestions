import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scin = new Scanner(System.in);
        int A =scin.nextInt();
        int B =scin.nextInt();
      int N =scin.nextInt();
        
        calculateN(A,B,N);
        //  java.math.BigInteger A = br.
        
    }
    
    public static BigInteger calculateN(Integer A,Integer B,Integer N)
        {
    	BigInteger A1 = BigInteger.valueOf(A.intValue());
    	BigInteger B1 = BigInteger.valueOf(B.intValue());
        if(N==1)
            return A1;
		if(N==2)    
        return B1;
        
       BigInteger result = calculateN(A,B,N-1).pow(2).add(calculateN(A, B, N-2));
       
       return result;
        
    }
    
    
}