package payroll;

import automationtool.ChromeDriver;
import automationtool.FirefoxDriver;
import automationtool.SafariDriver;
import automationtool.WebDriver;

public class TestPayroll {
	WebDriver obj;
	
	public void getBrowser(String browser)
	{

		if(browser.equalsIgnoreCase("chrome"))
		{
			 obj=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			 obj=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari"))
		{
			 obj=new SafariDriver();
		}
		else
		{
			System.out.println("Invalid browser");
		}
		
		obj.getTitle();
		obj.getUrl();
		obj.pageSource();
		obj.quit();	
	}
	
	public static void main(String[] args) {
		TestPayroll obj=new TestPayroll();
		obj.getBrowser("firefox");
	}

}
