package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// pending to hover on tools
public class Tester2 {

	public static void main(String[] args) throws AWTException {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		 WebElement elem = wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		  
		 driver.get("https://automationstepbystep.com/");
		  
		 WebElement ele =
		 driver.findElement(By.xpath("//a[contains(@href,'tools')]")); WebElement
		 showMeLink = driver.findElement(By.linkText("Show Me"));
		  
		 Actions actions = new Actions(driver); actions.moveToElement(ele).perform();
		 
		String month="NOVEMBER";
		month=month.substring(0, 1)+month.substring(1).toLowerCase().substring(0,3);
		System.out.println(month);
		
		Robot robot=new Robot();
		
		
		
	}

}
