import java.util.*;
class AllScan
{
	public static void main(String ars[])
	{
		Scanner s = new Scanner(System.in);

		String name;
		int age;
		char g;
		double w;

		System.out.print("Enter the Name:");
		name = s.next();

		System.out.print("Enter the Age:");
		age= s.nextInt();
	
		System.out.print("Enter the Gender:");
		g= s.next().charAt(0);

		System.out.print("Enter the Weight:");
		w= s.nextDouble();

		System.out.println("Output");
		System.out.println(name);
		System.out.println(age);
		System.out.println(g);
		System.out.println(w);
	}
}
	





	

