package automationtool;

public class SafariDriver implements WebDriver{
	
	
	public SafariDriver()
	{
		System.out.println("launched safari");
	}

	@Override
	public void getTitle() {
System.out.println("title from safari");
		
	}

	@Override
	public void getUrl() {
		System.out.println("url from safari");
		
	}

	@Override
	public void pageSource() {
		System.out.println("pagesource from safari");
		
	}

	@Override
	public void quit() {
		System.out.println("quit from safari");
		
	}

}
