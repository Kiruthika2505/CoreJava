class Rectangle
{
	double l,b;
	void getData(double l1,double b1)
	{
		l = l1;
		b = b1;
	}
	void area()
	{
			//return l*b;
		double ans = l*b;
		System.out.println("Rectangle Object:" +ans);
		
	}

}
class MainRect
{
	public static void main(String ars[])
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		r1.getData(2.0,8.0);
		r2.getData(5.0,9.0);

		r1.area();
		r2.area();

		//double ans1 = r1.area();
		//double ans2 = r2.area();
		
		//System.out.println("Rectangle Object1:" +ans1);
		//System.out.println("Rectangle Object1:" +ans2);
	}
}
