
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
		int a=sc.nextInt();
		int d=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a;
			a=a+d;
		}
		System.out.print(sum);
		
		
			