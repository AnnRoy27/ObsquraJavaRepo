package pack1;

public class SampleA {
  // accessmodifier datatype variablename
	private int a;
	int b;
	protected int c;
	public int d;
	
	
	private void getA()
	{
		System.out.println("private method");
	}
	 void getB()
	{
		 System.out.println("default method");	
	}
	
	protected void getC()
	{
		System.out.println("protected method");
	}
	
	public void getD()
	{
		System.out.println("public method");
		
	}
	
	
	public static void main(String[] args) {
	SampleA obj=new SampleA();
	obj.a=10;
	obj.b=20;
	obj.c=30;
	obj.d=40;
	obj.getA();
	obj.getB();
	obj.getC();
	obj.getD();
	

	}
	

}
