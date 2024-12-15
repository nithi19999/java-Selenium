package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		//driver.get("https://www.myntra.com/");
	
		driver.manage().window().maximize();
		
		
		// tag with id ( use #).. tag is optional # compLSary
		
		//driver.findElement(By.xpath("(//a[text()='Men'])[1]")).click();//myntra
		
		//boolean logo = driver.findElement(By.cssSelector("div#logo")).isDisplayed();
		//System.out.println(logo);//true
		
		//boolean logo = driver.findElement(By.cssSelector("#logo")).isDisplayed();
		//System.out.println(logo);//true
		
		//tag with class
//		Thread.sleep(5000);
//		 driver.findElement(By.cssSelector("input.form-control")).sendKeys("ddd");
		//driver.findElement(By.cssSelector(".form-control")).sendKeys("ddd");
//		 Thread.sleep(5000);
		
		//tag with attribute( not . required)
		//driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("ddd");
		
		
		//tag .class with attribute(one spesific element
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.form-control[placeholder=\"Search\"]")).sendKeys("ddd");
		Thread.sleep(5000);
		
		driver.quit();
	

	}

}
