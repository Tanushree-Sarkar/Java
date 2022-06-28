import java.util.*;
class prac1
{
    int n,i,f=0;
    void input()
    {
        System.out.print("Enter the number: ");
        Scanner t= new Scanner(System.in);
        t.close();
        n=t.nextInt();
    }
    void process()
    {
        for(i=2;i<=n/2;i++)
        {
            if (n%i==0)
            {
                System.out.print("Not prime");
                break;
            }
            else
            {
                f=1;
            }
        }
        if (f!=0)
            System.out.print("Prime");
        
    }
    public static void main(String args[])
    {
        prac1 obj=new prac1();
        obj.input();
        obj.process();

    }
}