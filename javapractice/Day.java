import java.util.*;
class Day
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int day;
	
		System.out.println("Enter the number between 1 to 7 to know days:   ");
		day = sc.nextInt();

		switch(day)
		{

			case 1:
					System.out.println("Sunday");
					break;
			case 2:
					System.out.println("Monday");
					break;
			case 3:
					System.out.println("Tuesday");
					break;
			case 4:
					System.out.println("Wednesday");
					break;
			case 5:
					System.out.println("Thursday");
					break;
			case 6:
					System.out.println("Friday");
					break;
			case 7:
					System.out.println("Saturday");
					break;	
			default:
					System.out.println("Pls enter the value between 1 to 7");
					
		}
	}
}
		



/*

Switch checks the given value againt the case value -> if the case value is matched the related case block statement will be executed by breaking 
the case.

























