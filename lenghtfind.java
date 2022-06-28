//Find Lenght of string
import java.util.Scanner;
public class lenghtfind
{
	String nm;
	int l;
	void Accept()
	{
		System.out.println("Enter Your String..... ");
		Scanner sc=new Scanner(System.in);
		nm=sc.nextLine();
	}
	void Display()
	{
		l=nm.length();
		System.out.println("Your String is ... " +nm);
		System.out.println("Lenght of String is.. " +l);
	}
	public static void main(String args[])
	{
		lenghtfind obj=new lenghtfind();
		obj.Accept();
		obj.Display();
	}
}