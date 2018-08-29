import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] ary = s.split("");
        Set<String> mySet = new HashSet<String>(Arrays.asList(ary));

        if(s.length() == mySet.size()){
            System.out.print( "Yes");
        }else{
            System.out.print( "No");
        }
	}
}
