package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserOpen {

	
	public static void main(String[] args) {
		
		
		// How to create an instance for Firefox browser.
	 	WebDriver ff= new FirefoxDriver();
		
		// How to create an instance for Internet Explorer.
		
//		System.setProperty("webdriver.ie.driver", "C:\\Selenium Automation\\IeServerDriver\\IEDriverServer.exe");
//		
//		WebDriver IE = new InternetExplorerDriver();
//		
//		WebDriver Chrome= new ChromeDriver();
//		
//		WebDriver safari = new SafariDriver();
//		
		WebDriver html = new HtmlUnitDriver();
		
		
//		
//		
		
		

	}

}
