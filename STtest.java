class Student2
{
    int d;
    void getData(int n)
    {
        
        d=n;
    }
    void printData()
    {
        System.out.println(d);
    }
}
class STtest
{
    public static void main(String args[])
    {
        Student2 s1=new Student2();
        Student2 s2=new Student2();
        s1.getData(10);
        s1.printData();
        s2.getData(30);
        s2.printData();
    }
    

}
