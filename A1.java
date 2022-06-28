interface Sum
{
    int a=5,b=10;
}
interface Add
{
    int c=3,d=2;
}
class A1 implements Sum,Add
{
    public static void main(String args[])
    {
        System.out.println(a+b);
        System.out.println(c+d);   
    }
}