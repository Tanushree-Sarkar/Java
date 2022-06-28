import java.util.*;
class Sum3
{
    int a[],n,t,sum=0;
    void process()
    {
        System.out.print("Enter the value: ");
        Scanner sc=new Scanner(System.in);
        a = new int[6];
        for(int i=0;i<6;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=5;j>i;j--)
            {
                for(int k=4;k>j;k--)  
                {
                    sum=a[i]+a[j]+a[k];
                    if(sum==0)
                    {
                        System.out.println("Index Number: ["+a[i]+","+a[j]+","+a[k]+"]");
                    }
                    sum=0;
                } 
            }
        }


    } 
    public static void main(String args[])
    {
        Sum3 obj=new Sum3();
        obj.process();
    }
}
