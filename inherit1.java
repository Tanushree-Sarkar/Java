import java.util.Scanner;
public class inherit1
{
	int x,y;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two no......");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	void display()
	{
		System.out.println("Hello in class 1");
		System.out.println("x=" +x);
		System.out.println("y=" +y);
	}
}