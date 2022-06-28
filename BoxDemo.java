public class BoxDemo
{
	public static void  main(String args[])
	{
		Box mybox1=new Box();
		double vol;
		vol=mybox1.volume();
		System.out.println("Volume is "+vol);
		Box mybox2=new Box(12,15,13);
		vol=mybox2.volume();
		System.out.println("Volume is "+vol);
	}
}