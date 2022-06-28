import java.util.Scanner;
class process
{
    void swap(int a,int b)
    {
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping:");
        System.out.println(a);
        System.out.println(b);
    }
}
class swap
{
    public static void main(String args [])
    {
        process obj=new process();
        int a,b;
        System.out.println("Enter two numbers: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        obj.swap(a,b);
        sc.close();
    }
}
