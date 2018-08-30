import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		for(int i=0;i<1;i++)
		{
			int even=0,odd=0;
			
			char stre[]=new char[50],
			 stro[]=new char[50];
		
		for(int j=0;j<n.length();j++)
		{
			if((j%2)==0)
			{
				stre[even]=n.charAt(j);
				even++;
			}
			if((j%2)==1)
			{
				stro[odd]=n.charAt(j);
				odd++;
			}
		}
		System.out.print(stre);
		System.out.print(" ");
		System.out.print(stro);
	}
	;
	
	}
	}
