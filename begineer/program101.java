import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // Actually use the Reader
    String name = br.readLine();
    // Don't mistake String object with a Character object
    String s1 = name.substring(0, 1).toUpperCase();
    String nameCapitalized = s1 + name.substring(1);
    System.out.println(nameCapitalized);
	}
}
