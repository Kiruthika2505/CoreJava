class DemString
{
	public static void main(String args[])
	{

		String a = "KGM";
		char ch[] = {'c','o','i','m','b','a','t','o','r','e'};
		
		String b = new String(ch); // Converting character array into String
		String c = new String("Saravanampatti"); 

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("character At:  "+c.charAt(4));
		System.out.println("String Length:  "+c.length());
		System.out.println("Substring Begin:   "+c.substring(9));
		System.out.println("Substring Begin&End:  "+c.substring(0,8));
		System.out.println("Check letter b is available:  "+c.contains("b"));

	}

}













