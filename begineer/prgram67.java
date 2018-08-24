import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
	
	
	static int round(int n)
	{
		
		int a = (n / 10) * 10;
		
	
		int b = a + 10;
	
		
		return (n - a > b - n)? b : a;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(round(n));
	

	}
}
