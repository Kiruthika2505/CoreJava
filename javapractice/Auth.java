import java.util.*;
class Auth
{
	public static void main(String[] args)
	{
		Scanner sc = new  Scanner(System.in);
		char un;
		int pwd;
	
		System.out.println("Enter the Username");
		un = sc.next().charAt(0);
		System.out.println("Enter the Password");
		pwd = sc.nextInt();

		if(( un == 'k' ) && (pwd == 2505))
		{
			System.out.println("Your Authenticated User");

		}
		else
		{
			System.out.println("Incorrect Username and Password");

		} 
		
	}
}x