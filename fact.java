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
class fact
{
    public static void main(String args[])
    {
        input obj=new input();
        int n,p;
        System.out.println("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=obj.value(n);
        System.out.println(p);
        sc.close();

    }
}