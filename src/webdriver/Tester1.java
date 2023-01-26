package webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//String value = driver.findElement(By.name("q")).getText();
		//System.out.println("vale= "+ value);
		//driver.findElement(By.name("q")).sendKeys("ammer police ah?");
		String  s="string";
		System.out.println(s);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("alert('hyey');");
		System.out.println("hi");
		js.executeScript("scrollBy(0,900)");
		
		
		

	}

}
