import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<m;i++)
		{
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
			{
				 count=0;
				break;
	
			}
			else
			{
				count=1;
			}
			
		
			
		}
		if(count==1)
		{
			System.out.print(i);
}
}
}
}
