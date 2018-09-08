import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,sum=0;
		while(i<=n)
		{
			if((n%i)==0)
			{
				sum++;
			}
			i++;
		}
		if(sum>2)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
