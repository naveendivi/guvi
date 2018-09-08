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
		int f=0;
		while(n!=0)
		{
			int r=n%10;
			  f=f*10+r;
			n=n/10;
			
		}
	
		while( f!=0)
		{
			int e=f%10;
			int t=e;
			  f=f/10;
			  System.out.print(t+" ");
		}
		
		
	}
}
