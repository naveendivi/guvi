import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[20];
		while(n!=0)
		{
		int	r=n%10;
			
			if((r%2)!=0)
			{
				a[i++]=r;			
			}
			n=n/10;
			
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(" "+a[j]);
		}
	}
}
