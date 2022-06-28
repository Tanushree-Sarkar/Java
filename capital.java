import java.util.Scanner;
public class capital
{
	public static void main(String args[])
	{
		String nm;
		int l,t=0;
		System.out.println("Enter Your String..... ");
		Scanner sc=new Scanner(System.in);
		nm=sc.nextLine();
		l=nm.length();
		System.out.println("Your String is ... " +nm);
		System.out.println("Lenght of String is.. " +l);
		char arry[]=nm.toCharArray();
		for(int i=0;i<l;i++)
		{
			if(arry[i]>='A' && arry[i]<='Z')
			{
				t++;
			}
		}
		System.out.println("Number Of Captital Letter is : "+t);
	}
	
}