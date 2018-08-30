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
		
		for(int i=0;i<n.length();i++)
		
		{
			if(Character.isDigit(n.charAt(i)))
			{
				System.out.print(n.charAt(i));
			}
		}
	}
}
