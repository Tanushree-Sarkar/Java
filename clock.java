import java.util.Scanner;
class clock1
{
    int n,k,j=0;
    void process()
    {
        System.out.println("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a positive integer: ");
        k=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=n-k;i<n;i++)
        {
            arr1[j]=arr[i];
            j++;
        }
        j=k;
        for(int i=0;i<n-k;i++)
        {
            arr1[j]=arr[i];
            j++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr1[i]);
        }


    }
    
}
class clock
{
    public static void main(String args[])
    {
        clock1 ob=new clock1();
        ob.process(); 
    }        
}
