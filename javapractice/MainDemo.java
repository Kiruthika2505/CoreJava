// Class and Object  - Sandy object
import java.util.*;
class Student
{
	int rollno;
	String name;
	int mark1,mark2,mark3;
	double total,per;
	void getData(int r1,int m1,int m2,int m3,String nam)
	{
		rollno = r1;
		name = nam;
		mark1 = m1;
		mark2=m2;
		mark3=m3;
	}
	void processData()
	{
		total = mark1+mark2+mark3;
		per = total/3;

	}
	void displayData()
	{
		System.out.println("\t------------------------------------------------");
		System.out.println("\t\tSTUDENT DETAILS");
		System.out.println("\t------------------------------------------------");
		System.out.println("Student Name :   "+name);
		System.out.println("Student Rollno :   "+rollno);
		System.out.println("Mark1 :   "+mark1);
		System.out.println("Mark2 :   "+mark2);
		System.out.println("Mark3 :   "+mark3);
		System.out.println("\t------------------------------------------------");
		System.out.println("Total:   "+total);
		System.out.println("Percentage:   "+per);
	}

}
class MainDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Student obj = new Student();
		int r1,mm1,mm2,mm3;
		String nm;
	
		System.out.println("Enter the Rollno:");
		r1 = sc.nextInt();
		System.out.println("Enter the Name:");
		nm = sc.next();
		System.out.println("Enter the Mark1:");
		mm1 = sc.nextInt();
		System.out.println("Enter the Mark2:");
		mm2 = sc.nextInt();
		System.out.println("Enter the Mark3:");
		mm3 = sc.nextInt();


		obj.getData(r1,mm1,mm2,mm3,nm);
		obj.processData();
		obj.displayData();
	}
}




/*
Method definition:


			return type methodname(argument list)
			{

			}

*/
