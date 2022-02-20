package automationtool;

public class FirefoxDriver implements WebDriver {
	public FirefoxDriver()
	{
		System.out.println("launched firefox");
	}
	@Override
	public void getTitle() {
System.out.println("title from firefox");
		
	}

	@Override
	public void getUrl() {
		System.out.println("url from firefox");
		
	}

	@Override
	public void pageSource() {
		System.out.println("pagesource from firefox");
		
	}

	@Override
	public void quit() {
		System.out.println("quit from firefox");
		
	}

}
