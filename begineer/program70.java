import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String a,b="";
		Scanner sc=new Scanner(System.in);
		 a=sc.nextLine();
		int n=a.length();
		for(int i=n-1 ; i>=0 ; i--)
		{
			b=b+a.charAt(i);
		}
		
			if(a.equalsIgnoreCase(b))
			{
				System.out.print("yes");
				
			}
			else
			{
				System.out.print("no");
			}
		}
	}
