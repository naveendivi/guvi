import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		StringBuilder sb=new StringBuilder(str);
		if((n%2)!=0)
		{
			sb.setCharAt(n/2,'*');
			str=sb.toString();
			System.out.print(str);
		}
		else
		{
			sb.setCharAt(n/2,'*');
			sb.setCharAt(n/2-1,'*');
			str=sb.toString();
			System.out.print(str);
		}
	}
}
