package abstraction;

public class LoginPage extends WebPage{

	
	public static void main(String[] args) {
		LoginPage obj =new LoginPage();
		
		obj.getTitle();
		obj.getURl();
		obj.logo();
		obj.doLogin();
		obj.footer();
		
			
	}

	@Override
	public void getTitle() {
	System.out.println(" Login ");
		
	}

	@Override
	public void getURl() {
		System.out.println(" https://www.amazon.com/login ");
		
	}
	
	
	public void doLogin()
	{
		System.out.println(" user logged in ");
	}

}
