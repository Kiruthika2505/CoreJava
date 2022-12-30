import java.util.*;
class UN
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1;
		int n;
		System.out.println("Enter the username");
		s1 = sc.next();
		System.out.println("Enter the Password");
		n = sc.nextInt();

		if(s1.equals("kgcas"))
		{
			if(n==1234)
			{
				System.out.println("Valid user");
			}
			else
			{
				System.out.println("InValid Password user");
			}
		}
		else
		{
			System.out.println("InValid Username user");
		}
		
	}
}