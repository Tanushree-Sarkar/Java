public class FCFS {
    void calculation()
    {
        float av[]={0,1,4},br[]={5,2,7};
        float wt,a,bt,c;
        a=av[0];
        bt=br[0]-av[1];
        c=br[2]-av[2];
        wt=(a+bt+c)/3;
        System.out.println(wt);

    }
    public static void main(String args [])
    {
        FCFS obj=new FCFS();
        obj.calculation();
    }
}
