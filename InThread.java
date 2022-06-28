class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=4;i++)
        {
            System.out.println("Inside Class A " +i);
        }
        System.out.println("Outside of Class A");
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=1;i<=4;i++)
        {
            System.out.println("Inside Class B " +i);
        }
        System.out.println("Outside of Class B");
    }
}
class InThread
{
    public static void main(String args[])
    {
        A obj=new A();
        B obj2=new B();
        Thread ob1=new Thread(obj);
        Thread ob2=new Thread(obj2);
        ob1.start();
        ob2.start();
    }
}
