class Rectangle
{
	double l,b;

	Rectangle(double l1,double b1)  // Parameterized Constructor
	{

		l = l1;
		b = b1;
	}
	double area()
	{
		return l*b;
	}
	Rectangle()
	{
		System.out.println("Hai, Im a Constructor Rectangle with no Arguments");
	}
}
class RectMain
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle(5.0,7.0);
		Rectangle r2 = new Rectangle();
	
		double ans = r1.area();
		System.out.println("Area of the Rectangle(Parameterized Constructor) :   "+ans);
	}
}
		