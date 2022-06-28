class overload
{
    void test()
    {
        System.out.println("Non parameterized method");
    }
    void test(int a)
    {
        System.out.println("Value of a is: "+a);
    }
    void test(int a,int b)
    {
        System.out.println("Value of a and b is: "+a+ " "+b);
    }
    double test(double a)
    {
        System.out.println("double a: "+a);
        return a*a;
    }
}
class overloadp
{
    public static void main(String args[])
    {
        overload obj=new overload();
        double result;
        obj.test();
        obj.test(10);
        obj.test(10,20);
        result=obj.test(123.25);
        System.out.println("result of a*a is: "+result);
    }
}