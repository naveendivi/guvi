import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static String sortString(String inputString)
	{
		char temp[]=inputString.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String inputString=sc.nextLine();
		String in=sortString(inputString);
		System.out.print(in);
	}
	
		
	}
