import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int spl=0,v=0;
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		for (int i=0;i<n.length();i++)
		{
			
		char ch=n.charAt(i);
		
		 if((ch>='a')&&(ch<='z'))
		{
		}
		else if((ch>='A')&&(ch<='Z'))
		{
		}
		else if((ch>='0')&&(ch<='9'))
		{
			spl++;	
		}
		else
		{
			v++;
		}
		}
		System.out.print(spl);
	}
}
