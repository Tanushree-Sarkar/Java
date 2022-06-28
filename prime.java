import java.util.Scanner;
class process
{
    void primeNo(int n)
    {
        int i,j,c=0;
        for(i=2;i<=n;i++)
        {
            for(j=2;j<i;j++)
            {
                if (i%j==0)
                {
                    c=1;
                }
            }
            if (c==0)
            {
                System.out.println(j+" ");
            }
            c=0;
        }
    }
}
public class prime
{
    public static void main(String args[])
    {
        process obj=new process();
        int n1;
        System.out.println("Enter term: ");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        obj.primeNo(n1);
        sc.close();
    }

}