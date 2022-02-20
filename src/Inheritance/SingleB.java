package Inheritance;

public class SingleB extends singleA {

public void getB()
{
	
	System.out.println("method of class B");
}
	
	public static void main(String[] args) {
	

		SingleB  obj =new SingleB();
		obj.getB();
		obj.getA();
		
	}

}
