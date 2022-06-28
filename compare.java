import java.util.*;
class compare
{
    int i,f=0,size;
    int arr1[],arr2[];
    public void input()
    {
        System.out.print("Enter the size of array: ");
        Scanner s=new Scanner(System.in);
        s.close();
        size=s.nextInt();
        System.out.print("Enter the value for 1st array: ");
        for(i=0;i<=size;i++)
        {
            Scanner n=new Scanner(System.in);
            n.close();
            arr1[i]=n.nextInt();
        }
        for(i=0;i<=size;i++)
        {
            Scanner t=new Scanner(System.in);
            arr2[i]=t.nextInt();
            t.close();
        }
    }
    public void process()
    {
        for(i=0;i<=size;i++)
        {
            System.out.print(arr1[i]);
        }
    }
    public static void main(String args[])
    {
        compare obj = new compare();
        obj.input();
        obj.process();
       
    }
}