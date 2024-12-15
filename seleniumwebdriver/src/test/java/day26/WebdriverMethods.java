package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver=new ChromeDriver();
		
		
		// get methpods( work on webpages)
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		
		
//		System.out.println(driver.getCurrentUrl());//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//		
//		System.out.println(driver.getTitle());//OrangeHRM
//		
//		System.out.println(driver.getWindowHandle());//8B88CE0FCEBC5529B0335C9D02F2AAE4
//		
//		// conditional methpods( work on webElement)
		
		//is displayed , is enabled,is selected
		
		//Thread.sleep(5000);
		//WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		//Thread.sleep(5000);
		//System.out.println(username.isDisplayed());//true
		//System.out.println(username.isEnabled());//true
		//Thread.sleep(5000);
		 //boolean username = driver.findElement(By.xpath("//button[normalize-space()='Login']")).isDisplayed();
		 //System.out.println(username);
		 
		
		 //is enabled
		//Thread.sleep(5000);
		 //boolean sts=driver.findElement(By.xpath("//input[@placeholder='Password']")).isEnabled();
		//System.out.println(sts);//true
		
		
		//is selected
		boolean sts=driver.findElement(By.xpath("check box x path/radio")).isSelected();
		
		
		
		
		 driver.close();
		 
		 
		 
		 
		 
		
		
		
		
		
	}

}