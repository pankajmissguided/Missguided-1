package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.missguided.co.uk/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//how to context click
		
		WebElement contclick= driver.findElement(By.linkText("Laptops"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(contclick).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(1000);
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		

	}

}

