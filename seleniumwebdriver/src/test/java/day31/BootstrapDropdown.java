package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		
		//select single check box
		
		//driver.findElement(By.xpath("//input[@value=\"Angular\"]")).click();
		
		List<WebElement> opt = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		System.out.println(opt.size());
		
		//select multiple options
		
		for(WebElement tt:opt) {
			
			if(tt.equals("Jva") || tt.equals("Oracle") || tt.equals("MySQL"));
			
			tt.click();
		}
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
