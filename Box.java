//Example of constructor
public class Box
{
	double width;
	double height;
	double depth;
	Box()
	{
		System.out.println("Default Constructor is calling");
		width=10;
		height=10;
		depth=10;
	}
	Box(double w,double h,double d)
	{
		System.out.println("Overloaded Constructor is calling");
		width=w;
		height=h;
		depth=d;
	}
	double volume()
	{
		return width*height*depth;
	}
}