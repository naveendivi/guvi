import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int k=1;
		 char a[]=n.toCharArray();
		for(int i=0;i<n.length();i++)
		{
			if((a[i]!='0')&&(a[i]!='1'))
			{
				k=0;	
				break;
			}
			
		}
		if(k==0)
		{
			System.out.print("no");
			
		}
		else
		{
			System.out.print("yes");
		}
		
	}
}
