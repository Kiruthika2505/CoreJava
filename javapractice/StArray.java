class StArray
{
		public static void main(String[] args)
		{

				int i, a[] = {10,55,99,5,2,3};
				int sum =0,max,min;

				for(i=0;i<6;i++)
				{
					System.out.println("Array Position/index:  "+i+ "    Array Value:  "+a[i]);
					sum = sum+a[i];
				}
				max = a[0];
				min = a[0];
			
				for(i=0;i<6;i++)
				{
					if(a[i] > max)
					{
							max = a[i];
					}
					if(a[i] < min)
					{
							min = a[i];
					}
				}
				System.out.println("Sum of these numbers:"+sum);
				System.out.println("Average of these numbers:"+(sum/6));
				System.out.println("Maximum value :"+max);
				System.out.println("Minimum value :"+min);
				System.out.println("Reverse Order");
				for(i=5;i>=0;i--)
				{
					System.out.println(a[i]);
				}
				
		}
}

/*

i=0
	a[0] - 10
	sum = sum+a[i] = 0+10 = 10
i=1
	a[1] -55
	sum = sum+a[i] = 10+55 = 65
i=2
	a[2] = 99
	sum =sum+a[i] = 65+99 = 164
i=3
	a[3] = 5
	sum = sum+a[i] = 164+5 = 169
i=4
	a[4] = 2
	sum =sum+a[i] = 169+2 = 171
i=5
	a[5] = 3
	sum = sum+a[i] = 171+3 = 174
*/
	











