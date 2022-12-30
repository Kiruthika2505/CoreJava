import java.util.*;
class Month
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		char m;
	
		System.out.println("Enter the First Letter of the Month to know name of the month:   ");
		m = sc.next().charAt(0);

		switch(m)
		{

			case 'j':
			case 'J':
					System.out.println("January");
					break;
			case 'f':
			case 'F':
					System.out.println("February");
					break;
				
			default:
					System.out.println("Pls enter the only first letter/character of month");
					
		}
	}
}
		
























