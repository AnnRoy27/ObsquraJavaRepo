package abstraction;

public class Test2 extends Test {

	@Override
	public void login() {
		
		System.out.println("logged in");
	}

	
	
	public static void main(String[] args) {
		
		//Test2 obj =new Test2();
Test obj=new Test2();
		obj.login();
	
		
		
	}
	
}
