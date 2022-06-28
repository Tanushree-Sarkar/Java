// import java.util.*;
// class repeat1
// {
//    void process()
//    {
//         int n1,n2,res=0,j;
//         System.out.println("Enter 1st number: ");
//         Scanner sc=new Scanner(System.in);
//         n1=sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         n2=sc.nextInt();
//         for(int i=n1;i<=n2;i++)
//         {
//             int d=0,c=0,r=0;
//             j=i;
            
//             if (c==0)
//                 res++;
            
//         }
//         System.out.println(res);
//    } 
// }
// class repeat
// {
//     public static void main(String args[])
//     {
//         repeat1 obj=new repeat1();
//         obj.process();
//     }
// }


import java.util.*;
public class repeat
{
    static int find(int n1, int n2) {
        int count = 0;
        for (int i = n1 ; i <= n2 ; i++) {
            int num = i;

            boolean[] visited = new boolean[10];

            while (num > 0) {
                if (visited[num % 10] == true)
                    break;
                visited[num % 10] = true;
                num /= 10;
            }

            if (num == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n1 = 11, n2 = 15;
        System.out.println(find(n1, n2));
    }
}