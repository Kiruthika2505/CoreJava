class StrMeth
{
	public static void main(String ars[])
	{
		String s = "Sachin";
		String s1 = "Sachin";
		String s3 = new String("Harbhajan");
		String s4 = "SACHIN";
		String s5 = s3;

		System.out.println("Original String:  "+s);
		System.out.println("Concatenation:  "+s.concat("Tendulkar"));

		System.out.println("String Equals:  "+s.equals(s1)); // true
		System.out.println("String Equals:  "+s.equals(s3)); //false
		System.out.println("String Equals:  "+s.equalsIgnoreCase(s4)); // false

		System.out.println((s==s1));
		System.out.println((s3 == s5));
		System.out.println((s==s5));

		String s6 = "A";
		String s7 = "a";
		String s8 = "a";

		System.out.println("toCompare"+s6.compareTo(s7));
		System.out.println("toCompare"+s8.compareTo(s7));
		System.out.println("toCompare"+s8.compareTo(s6));	

		String e="India";
		System.out.println("Uppercase:  "+e.toUpperCase());
		System.out.println("Lowercase:  "+e.toLowerCase());
		
	}
}