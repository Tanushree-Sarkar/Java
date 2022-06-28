class cons
{
    cons(int id,String name)
    {
        System.out.println(id);
        System.out.println(name);
    }
}
class Parameter
{
    public static void main(String args[])
    {
        cons obj1=new cons(1,"Tanushree");
        cons obj2=new cons(2,"Abhipsha");
    }
}