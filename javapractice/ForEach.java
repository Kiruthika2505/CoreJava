class ForEach
{
	public static void main(String args[])
	{
		int arr[] = {8,2,5,4,5,2,9,6,5,12};		
		int t=5;		
		for( int i : arr)
		{
			System.out.println(i);
		}
		System.out.println("Duplicate Element");
		for(int i:arr)
		{
			if(i==t)
			{
				System.out.println(i);
			}
		}
	}
}