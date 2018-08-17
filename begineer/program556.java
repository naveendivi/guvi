class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String numRegex=".*[0-9].*";
		String alphaRegex=".*[a-z].*";
		if(s.matches(numRegex)&&s.matches(alphaRegex))
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		}
}
