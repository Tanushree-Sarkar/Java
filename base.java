abstract class A
{

    abstract void gopal();

}
class B extends A
{
    void gopal()
        {
            System.out.println("Gopal");
        }
}
class base
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.gopal();
        // A ob = new A();
    }
}