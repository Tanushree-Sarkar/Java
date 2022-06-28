import java.util.Scanner;
class process
{
    void season(int n)
    {
        if (n==11|| n==12||n==1)
        {
            System.out.println("Winter");
        }
        if (n==2|| n==3)
        {
            System.out.println("Spring");
        }
        if (n==4|| n==5||n==6)
        {
            System.out.println("Summer");
        }
        if (n==7|| n==8||n==9||n==10)
        {
            System.out.println("Monsoon");
        }
    }
}
public class month
{
    public static void main(String a[])
    {
        process obj=new process();
        int n;
        System.out.println("Enter Month Number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        obj.season(n);
        sc.close();
    }
}
