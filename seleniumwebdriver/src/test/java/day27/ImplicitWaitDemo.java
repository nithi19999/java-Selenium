package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// if u dont use will get synchronization errors
		
		// get methpods( work on webpages)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(5000);
		
		
		
		 driver.close();
		 
		 
		 
		 
		 
		
		
		
		
		
	}

}