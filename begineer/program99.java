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
		int b=sc.nextInt();
		int c=sc.nextInt();
		int s=(n*b)%c;
		System.out.print(s);
	
	}
}