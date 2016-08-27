/*
 *
 In a regular expression, * represents 0 or more repetitions for preceding character. & represents the regex preceeding it is at the end of string. and all small case letters represent themselves. For example:
rat&
Pass: bigrat, smallrat
Fail: ratoulite rats
a*b
Pass: b, ab, aab
Fail a, asd
abc
Pass: abc, abcd zabcd
Fail: abdc, dabfc
Write a code for it

 */
public class Solution {

	public static void main(String args[]) {

		String[] input = {"cab"};//new String[10];
		String Regex ="a*b";
		for (int i = 0; i < input.length; i++) {
			boolean a = parse(Regex,input[i]);
			System.out.println(a);
		}
	}

	private static boolean parse(String Regex,String element) {
		
		boolean result=false;
		if(Regex.contains("&"))
		{
			String sub = Regex.substring(0, Regex.indexOf("&"));
			 result = parse1(sub,element);
		
		}
		else if(Regex.contains("*"))
		{
			result = parse2(Regex,element);
		}
		
		else
			result = element.contains(Regex);
		return result;
		
	}

	private static boolean parse2(String regex, String element) {
		
		int index = regex.indexOf("*");
		char check = regex.charAt(index-1);
		
		String str1 = regex.substring(0, index-1);
		if(regex.substring(0, index).length() > 1)
		{
			//String str2 = element.substring(0, index)
			for(int i=0,j=0;i<str1.length();i++)
				if(str1.charAt(i)!=element.charAt(j))
					return false;
		}
		
		String elementbefore = element.substring(0, index-1);
		int i=0;
		if(elementbefore.length()>0)
		while(elementbefore.charAt(i)!= check)
			i++;
		
		String elementafter = element.substring(i+1);
		regex=regex.substring(regex.indexOf("*")+1);
		for(int j =0;j<regex.length()&& i<elementafter.length();j++,i++)
		{
			if(regex.charAt(j)!= element.charAt(i))
				return false;
		}
		
		return true;
	}

	private static boolean parse1(String regex,String element) {
		
		for(int i =regex.length()-1, j= element.length()-1;i>=0;i--,j--)
		{
			if(regex.charAt(i)!=element.charAt(j))
			return false;
		}
		
		
		return true;
	} 

}
