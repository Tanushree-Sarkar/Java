import java.util.Scanner;
class process
{
    int value(int n)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
        {
            f=f*i;
            
        }
        return f;
    }
}
class factorial
{
    public static void main(String args[])
    {
        process obj=new process();
        int n,p;
        System.out.println("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=obj.value(n);
        System.out.println(p);
        sc.close();
    }
}