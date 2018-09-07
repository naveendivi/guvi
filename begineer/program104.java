import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int r=1;
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int v=sc.nextInt();
		for(int i=0;i<v;i++)
		{
			r*=n;
		}
		System.out.print(r);
	}
}
