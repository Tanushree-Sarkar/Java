import java.util.Scanner;
class process
{
    void series(int n)
    {
        int i;
        float d=0,sum=0,fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
            d=1/fact;
            sum=sum+d;
        }
        System.out.println(sum);

    }
}
public class SumSeries
{
    public static void main(String args[])
    {
        process obj=new process();
        int n;
        System.out.println("Enter terms: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        obj.series(n);
        sc.close();
    }
}
