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
		int v=sc.nextInt();
		n=n^v;
		v=n^v;
		n=n^v;
		System.out.print(n+" "+v);
		
	}
}
