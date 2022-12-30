import java.util.*;
class Fib
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,i,n;

		System.out.println("Enter any Number:");
		n = sc.nextInt();
		
		System.out.println("The Fibonnaci Series");
		n1 = 0;
		n2 = 1;
		n3 = n1+n2;
		
		System.out.println(n1+"\n"+n2);
		System.out.println(n3);
		for(i=1;i<=n;i++)
		{
			n1 = n2;
			n2 = n3;
			n3 = n1+n2;
			System.out.println(n3);
		}
		
		
		
		
	}
}

n1 = 0
n2 = 1
n3 = 1

i = 1 
		n1 = n2 =  1
		n2 = n3 =  1
		n3 = n1 +n2 = 1+1 = 2
i =2
		n1 = n2 = 1
		n2 = n3 = 2
		n3 = n1+n2 = 1+2 = 3

i=3
		n1 = n2 = 2
		n2 = n3 = 3
		n3 = n1+n2 = 2+3 = 5

i=4

		n1 =n2= 3
		n2=n3 =5
		n3 = n1+n2 = 3+5 = 8































