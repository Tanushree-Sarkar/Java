class overload
{
    overload()
    {
        System.out.println("Inside Default constructor");
    }
    overload(int a)
    {
        System.out.println("Square of a is "+(a*a));
    }
    overload(int a,int b)
    {
        System.out.println("Addition is "+(a+b));
    }
    void show()
    {
        System.out.println("Inside paramiterized function");
    }
    void show(int a)
    {
        System.out.println("Square of a is "+(a*a));
    }
    void show(int a,int b)
    {
        System.out.println("Addition is "+(a+b));
    }
    public static void main(String args[])
    {
        overload ob=new overload();
        overload ob1=new overload(2);
        overload ob2=new overload(2,4);
        ob.show();
        ob1.show(2);
        ob2.show(2,4);
    }
}
