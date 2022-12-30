class NestLoop1
{
		public static void main(String[] args)
		{
			int row,col,i;			
			for(row=1;row<=6;row++)
			{
				for(i=6;i>=1;i--)
				{
				System.out.print(" ");
				}
		
				for(col=1;col<=row;col++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}
}

/*
Outer loop: (row>=1)
row = 5
		innerloop
				(col=1;col<=row;col++)
						*  * * * *

Outer loop: (row>=1) row--
row = 4
		innerloop
				(col=1;col<=row;col++)
						*  * * * *
						*  * * *
Outer loop: (row>=1) row--
row = 3
		innerloop
				(col=1;col<=row;col++)
						*  * * * *
						*  * * *
						*  * *
Outer loop: (row>=1) row--
row = 2
		innerloop
				(col=1;col<=row;col++)
						*  * * * *
						*  * * *
						*  * *
						* *

Outer loop: (row>=1) row--
row = 1
		innerloop
				(col=1;col<=row;col++)
						*  * * * *
						*  * * *
						*  * *
						* *
						*
*/








							













































