/* Break:
	
		- It is used to break the flow of control  based on some condition
		- It come out of the loop when condition is met. */

class brk
{
	public static void main(String[] args)
	{
		
		for(int i=1;i<=10;i++)
		{
				if(i==6)
				break;
				System.out.println(i);
		}
	}
}