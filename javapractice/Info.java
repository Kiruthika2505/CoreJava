import java.util.*;
class Info
{
		public static void main(String lu[])
		{
			Scanner op=new Scanner(System.in);

			String name;
			int RollNo;
			int Subject1;
			int Subject2;
			int Subject3;

		
			System.out.print(" Name :");
			name=op.nextLine();

		        System.out.print(" RollNo :");
			RollNo=op.nextInt();

			System.out.print("Subject1:");
			Subject1=op.nextInt();

			System.out.print("Subject2:");
			Subject2=op.nextInt();

			System.out.print("Subject3:");
			Subject3=op.nextInt();

			int Total;
			Total=Subject1+Subject2+Subject3;

			float Percentage;
			Percentage=Total/3f;
			
			float Result;
			char Grade;
                     		
			if((Subject1>=35) && (Subject2>=35) && (Subject3>=35))
			{
				System.out.println(
			
			System.out.println("Output");

			System.out.println("----------------------------------");
                          System.out.println("        MarkStatement");
			System.out.println("----------------------------------");
			
			System.out.println("RollNo:"+RollNo);
			System.out.println("Name:"+name);
			System.out.println("Subject1 Mark: "+Subject1);
			System.out.println("Subject2 Mark: "+Subject2);
			System.out.println("Subject3 Mark: "+Subject3);

			System.out.println("Total:"+Total);
			System.out.format("Percentage: "+"%.3f",Percentage);

			Sy
			}

}



 
			
