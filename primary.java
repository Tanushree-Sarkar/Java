import java.util.Scanner;
class Student
{
    protected int age;
    private static int Object_Counter=0;
    Student()
    {
        Object_Counter+=1;
        int Enrolment_No=Object_Counter;
        System.out.println("Number of objects created: "+Enrolment_No);
    }
    void Validate(int a)
    {
        if(a>=4 && a<=40)
        {
            System.out.println("Value Assigned Successfully");
            age=a;
        }
        else
        {
            System.out.println("Sorry,Plz Enter Age Between 4-40");
        }
    }
    protected void finalize()
    {
        Object_Counter-=1;
    }
    public static void Display()
    {
        System.out.print("After calling finalize() Number of objects: ");
        System.out.println(Object_Counter);
    }
}
public class primary extends Student
{
    public static void main(String[] args)
    {
        int n;
        Student ob=new Student();
        Student ob2=new Student();
        Student ob3=new Student();
        System.out.println("Enter Age: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ob.Validate(n);
        ob3.finalize();
        Display();
        sc.close();
    }
}