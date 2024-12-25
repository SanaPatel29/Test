package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {
	
		  WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://www.amazon.in/");
			
			WebElement Ele = driver.findElement(By.xpath("//span[@contains(text(),'Account & Lists')]"));
			
			Actions Act = new Actions(driver);
			
		    Act.moveToElement(Ele).build().perform();
		    
		    driver.findElement(By.xpath("//span[contains(text(),'Your Orders')]")).click();
		    
		    driver.findElement(By.id("ap_email")).sendKeys("Test@gmail");
		    
		    driver.findElement(By.id("continue")).click();
		    
		   //to pause the screen go to inspect - go to source -then go ||> this image click short key is contol slash for windows
		    //and for mac it is 
		

	}

}
