import java.util.Scanner;
class SwapRef
{
    int a,b;
    void swap(SwapRef obj)
    {
        int temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;
    }
    void value()
    {
        System.out.println("Enter 1st value: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter 2nd value: ");
        b=sc.nextInt();
        sc.close();
        
    }
    public static void main(String args[])
    {
        SwapRef obj=new SwapRef();
        obj.value();
        obj.swap(obj);
        System.out.println(obj.a+ " "+obj.b);
        
    }
}
