import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int temp,l,count=0,k;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n+1;i<m;i++)
		{
			temp=i;
			k=0;
			while(temp!=0)
			{
				l=temp%10;
				k=k+(l*l*l);
				temp=temp/10;
			}
			if(i==k)
			{
				if(count==0)
				{
				}
					System.out.print(i);
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(" ");
			}
		}
	}
