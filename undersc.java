import java.util.*;
class undersc
{
    int i;
    void process()
    {
        System.out.print("Enter your string: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==' ')
            {
                arr[i]='_';
            }
        }
        System.out.print(arr);
    }
    public static void main(String args[])
    {

        undersc obj=new undersc();
        obj.process();
    }
}
