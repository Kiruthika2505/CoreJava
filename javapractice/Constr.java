class Rectangle
{
	double l,b;
	Rectangle(double l1,double b1)
	{
		l = l1;
		b = b1;
	}
	void area()
	{
		double ans = l*b;
		System.out.println("Rectangle Object:" +ans);
	}
}
class Constr
{
	public static void main(String ars[])
	{
		Rectangle r1 = new Rectangle(2.0,8.0);
		Rectangle r2 = new Rectangle(5.0,9.0);
		r1.area();
		r2.area();	
	}
}


/* Constructor

-------- Constructor is a method which has same name as class name.
-------- When object is created the constructor will be automatically invoked(Execute).
--------- Constructor is used for object creation.


*/





















 