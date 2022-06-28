import java.util.*;
class prac
{
    int a,b,c;
    public void Input()
    {
        System.out.print("Enter 1st Number: ");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        System.out.print("Enter 2nd Number: ");
        b=s.nextInt();
        s.close();
    }
    public void Process()
    {
        c=a+b;
        System.out.print("Result is: "+c);
    }
    public static void main(String args[])
    {
        prac obj = new prac();
        obj.Input();
        obj.Process();
    }
}