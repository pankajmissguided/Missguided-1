package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop{
	
	
	
	public static void main(String[] args) throws InterruptedException{
	
	  
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");  
		
	   Thread.sleep(2000);
	  driver.switchTo().frame(0);    
	 
	  WebElement dragElement=driver.findElement(By.id("draggable"));  
	  WebElement dropElement=driver.findElement(By.id("droppable"));  
	      
	  Actions builder = new Actions(driver);  // Configure the Action  
	  Action dragAndDrop = builder.clickAndHold(dragElement)  
	    .moveToElement(dropElement)  
	    .release(dropElement)  
	    .build();  // Get the action  
	    dragAndDrop.perform(); // Execute the Action  
	 
	}
}