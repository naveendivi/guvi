/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int rev=0,rem;
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
			
		}
		if(n==rev)
		{
			System.out.println("is a palindrome");
			
		}
		else
		{
			System.out.println("is not a palindrome");
		}
	}
}
