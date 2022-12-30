class bonus
{

	public static void main(String args[])
	{
		double bp = 12000;
		char gender = 'f';
		double bonus;

		if(bp >= 15000)  // Outer if block
		{

				if( gender == 'm') // Inner if block
				{
					bonus = bp*20/100;
					System.out.println("Bonus of an Employee"+bonus);
				}
				else
				{
					bonus = bp*38/100;
					System.out.println("Bonus of an Employee"+bonus);
				}
		}
		else
		{
				bonus = bp*18/100;
				System.out.println("Bonus of an Employee"+bonus);
		}
	}
}
		