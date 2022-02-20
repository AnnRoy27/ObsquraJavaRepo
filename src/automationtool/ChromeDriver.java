package automationtool;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver()
	{
		System.out.println("launched chrome browser");
	}
	
	@Override
	public void getTitle() {
System.out.println("title from chrome");
		
	}

	@Override
	public void getUrl() {
		System.out.println("url from chrome");
		
	}

	@Override
	public void pageSource() {
		System.out.println("pagesource from chrome");
		
	}

	@Override
	public void quit() {
		System.out.println("quit from chrome");
		
	}
}
