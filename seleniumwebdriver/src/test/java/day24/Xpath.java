package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//xpath with multiple attribute
		////input[@type="text"][@name="search"]
		
		//and or operator
		
		//input[@type="text"and@name="search"]// AND operator(both attribute should be true) xpath will be v strong
		//input[@type="text"or@name="search"]//OR operator( any one attribute should be true)
		
		// inner text xpath
		//ex.... a[text()='Desktops']
		
		// capture the text
		
//		boolean text=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
//		System.out.println(text);//true
//		
//		String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();//Featured
//		
//		System.out.println(value);
		
		// xpath with contains
		
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("dfdf");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("dfd");
		// xpath with statrts-with
		
		
		//contains  handling dynamic elements
		
		// name = xyz1,zyz2,xyz3,xyz4
		
		//  //*[contains(@name='xyz')]
		
		   //*[starts-with(@name='xyz')] ( the starting digits or alpabets sud same)
		
		//ex mname = 12x,23x,34x  not works for start-with works wirh contains
		
		driver.quit();
		

	}

}
