import java.util.Scanner;
class string
{
    void CheckPassword()
    {
        char ch,ch1;
        int char1=0,char2=0,digit=0,sp=0,c=0;
        System.out.println("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            ch1=str.charAt(0);
            ch=str.charAt(i);
            if(ch1>='0' && ch1<='9')
            {
                System.out.println("0");
                c++;
                break;
            }
            else if(ch=='/' || ch ==' ')
            {
                System.out.println("0");
                c++;
                break;
            }
            else if(ch>='a' && ch<='z')
            {
                char1++;
            }
            else if(ch>='A' && ch<='Z')
            {
                char2++;
            }
            else if(ch>='0' && ch<='9')
            {
                digit++;
            }
            else{
                sp++;
            }

        }
        if (c==0)
        {
            if (char2==0 || digit==0)
            {
                System.out.println("0");
            }
            else if((char2+char1+sp+digit)<4)
            {
                System.out.println("0");
            }
            else{
            System.out.println("1");
            }
        }
        
    }
}
class password
{
    public static void main(String srgs[])
    {
        string obj=new string();
        obj.CheckPassword();
    }
}