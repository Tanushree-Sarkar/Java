import java.util.Scanner;
class process
{
    void value(int x,int y,int z)
    {
        if((x>y) && (x>z))
        {
            System.out.println("Biggest Number is: "+x);
        }
        else if((y>x) && (y>z))
        {
            System.out.println("Biggest Number is: "+y);
        }
        else if((z>x) && (z>y))
        {
            System.out.println("Biggest Number is: "+z);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
public class Biggest 
{
    public static void main(String args[])
    {
        process obj=new process();
        int n1,n2,n3;
        System.out.println("Enter 1st number: ");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        n2=sc.nextInt();
        System.out.println("Enter 3rd number: ");
        n3=sc.nextInt();
        obj.value(n1,n2,n3);
        sc.close();

    }
}
