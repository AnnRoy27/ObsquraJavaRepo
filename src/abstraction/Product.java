package abstraction;

public class Product extends LoginPage{

public static void main(String[] args) {
	Product obj=new Product();
	obj.getURl();
	obj.getTitle();
	obj.doLogin();
	obj.footer();
}



public void footer()
{
	System.out.println(" product footer");	
}

}