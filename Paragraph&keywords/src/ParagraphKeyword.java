import java.util.regex.*;

public class ParagraphKeyword {

public void	getSnippetLength(String[] expressions)
	{
	  Pattern preIncrement = Pattern.compile("\\+\\+[a-zA-Z]");
	  Pattern postIncrement = Pattern.compile("[a-zA-Z]\\+\\+");
	  Pattern Add = Pattern.compile("[a-zA-Z]\\+[a-zA-Z]");
	  Pattern Sub = Pattern.compile("[a-zA-Z]\\-[a-zA-Z]");
	  Pattern Mul = Pattern.compile("[a-zA-Z]\\*[a-zA-Z]");
	  
	  
	  
	  for(int i =0;i<expressions.length;i++)
	  {
		  String st = expressions[i];
		  
		 /* 
		  switch (key) {
		case value:
			
			break;

		default:
			break;
		}*/
		  
		  Matcher matpreIncrement = preIncrement.matcher("st");
		  Matcher matpostIncrement = postIncrement.matcher("st");
		  Matcher add = Add.matcher("st");
		  Matcher sub = Sub.matcher("st");
		  Matcher mul = Mul.matcher("st");		  
	  }
	  
	  
	 /* 
	  if(matpostIncrement.find())
	  {
		  System.out.println(true);
	  }*/
	}
	
public static void main(String args[])
{
	
	ParagraphKeyword pk = new ParagraphKeyword(); 
//	pk.getSnippetLength("");
	}
}
