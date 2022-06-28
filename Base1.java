abstract class vehicle
{
    abstract void engine();
}
class car extends vehicle
{
    void engine()
    {
        System.out.println("Car has good engine");
    }
}
class truck extends vehicle
{
    void engine()
    {
        System.out.println("Truck has bad engine");
    }
}
class Base1{
    public static void main(String []args)
    {
        car obj1=new car();
        truck obj2=new truck();
        obj1.engine();
        obj2.engine();

    }
}