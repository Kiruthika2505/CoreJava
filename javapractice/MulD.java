import java.util.*;
class MulD
{
	public static void main(String ar[])
	{
		Scanner sc =new Scanner(System.in);
		int mat1[][] = new int[6][6];
		int mat2[][] = new int[6][6];
		int mat3[][] = new int[6][6];
		int row,col,rs,cs;
		System.out.println("Enter the how many no.rows and no.cols");
		rs = sc.nextInt();
		cs=sc.nextInt();
	
		System.out.println("Enter the Value for Matrix1");
		for(row=0;row<rs;row++)   
		{
			for(col=0;col<cs;col++)
			{
					mat1[row][col] = sc.nextInt();
			}
		}
		System.out.println("Enter the Value for Matrix2");
		for(row=0;row<rs;row++)   
		{
			for(col=0;col<cs;col++)
			{
					mat2[row][col] = sc.nextInt();
			}
		}
		System.out.println("Matrix1");
		for(row=0;row<rs;row++)   
		{
			for(col=0;col<cs;col++)
			{
					System.out.print(mat1[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("\n Matrix2 \n");
		for(row=0;row<rs;row++)
		{
			for(col=0;col<cs;col++)
			{
					System.out.print(mat2[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("\n Sum of Matrix 1 & 2 \n");
		for(row=0;row<rs;row++)
		{
			for(col=0;col<cs;col++)
			{
				mat3[row][col] = mat1[row][col] + mat2[row][col];	
				System.out.print(mat3[row][col]+" ");
			}
			System.out.println();
		}
	}
}















