package abstraction;

public abstract class WebPage {
	
	

	
	public abstract void getTitle();
	public abstract void getURl();

	public final void logo()
	{
		System.out.println(" Amazon logo");
	}
	
	public void header()
	{
		System.out.println(" Amazon header");	
	}

	public void footer()
	{
		System.out.println(" Amazon footer");	
	}

}
