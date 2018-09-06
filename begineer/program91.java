import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int b=sc.nextInt();
		int l=sc.nextInt();
		int w=(2*((l*b)+(b*h)+(h*l)));
		int q= l*b*h;
		System.out.print(w);
		System.out.print(" ");
		System.out.println(q);
	}
}
