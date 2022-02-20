package pack;

public class SampleA {
	int a;
	static String name;

	
	public void get()
	{
name="hello";
		
	}
	public  void set()
	{
		System.out.println(SampleA.name);

	
	}




	public static void main(String args[])
	{
	SampleA obj =new SampleA();
	obj.get();
	SampleA obj1 =new SampleA();
	obj1.set();



	}

}
