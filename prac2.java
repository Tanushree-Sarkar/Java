import java.util.Scanner;
class input
{
    int value(int n)
    {
        if (n>=1)
        {
            return n*value(n-1);
        }
        else
            return 1;
    }
}
class prac2
{
    public static void main(String args[])
    {
        int n,v;
        System.out.println("Enter your value: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        input obj=new input();
        v=obj.value(n);
        System.out.println("Result is: "+v);
    }
}