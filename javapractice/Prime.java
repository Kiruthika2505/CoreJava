import java.util.*;
import java.util.*;
class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,k,i;
		k=0;
		System.out.println("Enter any Number:");
		n = sc.nextInt();

		for(i=1;i<=n;i++) 
		{
			if( n%i==0)   
			k++;
		}
		if(k==2)
		{
			System.out.println("The Given Number is Prime"+n);
		}
		else
		{
			System.out.println("The Given Number is Not Prime"+n);
		}
	}
}


/*
for(i=1;i<=n;i++) 
		{
			if( n%i==0)      
			k++;
		}
i=1
	= 6/1 = 0
	k=1

i=2	
	=6/2 = 0
	k=2
i=3
	=6/3 = 0
	k=3
i=4
	=6/4 = 2
	k=3
i=5
	=6/5 =1
	k=3
i=6
	=6/6=0
	k=4
*/




















