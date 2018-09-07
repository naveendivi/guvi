import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=Integer.valueOf(String.valueOf(i) + String.valueOf(j));
		System.out.print(k);
	}
}
