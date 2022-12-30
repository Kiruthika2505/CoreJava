class CharArray
{
	public static void main(String args[])
	{

		char name[] = { 's','a','h','u','l'};
		int i;

		for(i=0;i<name.length;i++)
		{
			System.out.print(name[i]);
		}
		System.out.println("\nReverse of String");

		for(i=name.length-1;i>=0;i--)
		{
			System.out.print(name[i]);
		}
	}
}