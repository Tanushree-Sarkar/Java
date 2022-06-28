import java.util.*;
class arradd
{
    int a[],n,t,sum=0,size;
    void process()
    {
        System.out.print("Enter array size: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        System.out.print("Enter the value: ");
        a = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter your target: ");
        t=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            for(int j=size-1;j>i;j--)
            {
                sum=a[i]+a[j];
                if(sum==t)
                {
                    System.out.println("Index Number: ["+i+","+j+"]");
                }
                sum=0;
            }
        }


    } 
    public static void main(String args[])
    {
        arradd obj=new arradd();
        obj.process();
    }
}
