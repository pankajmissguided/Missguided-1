package Class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {

	
	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.missguided.co.uk/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("fk-top-search-box")).sendKeys("laptop");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='fk-header-search-form']/div/div/div[2]/input[1]")).click();
		
		Thread.sleep(3000);
		
	    WebElement links = driver.findElement(By.xpath("//*[@id='substores']/div[3]/ul/li/ul[1]/li/ul[1]/li/a"));
	    links.getText();
	    
	     System.out.println("Number of tops in a missguided" + links.getText());
	     
	     driver.findElement(By.xpath("//*[@id='substores']/div[3]/ul/li/ul[1]/li/ul[1]/li/a")).click();
	     
	     List<WebElement> clickLapt = driver.findElements(By.tagName("a"));
	     clickLapt.size();
	     
	     
	     System.out.println(clickLapt.size());
	     
	           for(WebElement allaptops : clickLapt){
	        	   
	        	   System.out.println(allaptops.getText());
	           }
		
		
		
	}

}
