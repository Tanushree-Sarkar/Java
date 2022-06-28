import java.util.Scanner;
class prac3
{
    int a,b;
    void swap(prac3 obj)
    {
        int temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;
    }
    void value()
    {
        System.out.println("Enter 1st number: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b=sc.nextInt();
    }
    public static void main(String args[])
    {
        prac3 obj=new prac3();
        obj.value();
        obj.swap(obj);
        System.out.println(obj.a+ " "+obj.b);
    }
}
