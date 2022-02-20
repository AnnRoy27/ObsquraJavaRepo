package Inheritance;

public class singleA {

	public singleA()
	{
		System.out.println("default");	
	}
	public singleA(int a)
	{
	System.out.println("parameter");	
	}
	public void getA()
	{
		
		System.out.println("method of class A");
	}
	public static void main(String[] args) {
		singleA obj=new singleA(6);
	}
	
	
	
}
