package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragaAndDrop1 {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
			
			WebElement Src = driver.findElement(By.id("box3"));
			
			WebElement dest = driver.findElement(By.id("box103"));
			
			WebElement Src1 = driver.findElement(By.id("box6"));
			
			WebElement dest1 = driver.findElement(By.id("box106"));
			
			Actions Act = new Actions(driver);
			
			Act.dragAndDrop(Src, dest).perform();
			Act.dragAndDrop(Src1, dest1).build().perform();
		
	}

}