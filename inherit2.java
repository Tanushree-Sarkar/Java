public class inherit2 extends inherit1
{
	void display()
	{
		super.display();
		System.out.println("Hello in class 2");
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}