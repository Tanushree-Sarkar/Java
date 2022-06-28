
class process
{
    void value()
    {

        int i,n1=0,n2=1,sum=0;
        System.out.println(n1);
        for(i=1;i<10;i++)
        {
            System.out.println(n2);
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
    }
}
public class fibo1
{
    public static void main(String args[])
    {
        process obj=new process();
        obj.value();
    }
}