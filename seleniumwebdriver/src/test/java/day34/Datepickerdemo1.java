package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickerdemo1 {
	
	static void selectfuturedate(WebDriver driver,String date,String month,String year) {
		while(true) {
			
			String Activemonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			String ActiveYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(Activemonth.equals(month) && ActiveYear.equals(year)){
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		// select dates
				List<WebElement>alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td/a"));
				
				for(WebElement dt:alldates) {
					if(dt.getText().equals(date)) {
						dt.click();
						//System.out.println(dt.getText());//17
						break;
					}
				}
				
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//send date directly
		
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/05/2025");
		//String month="May";
		//String year="2026";
		//String date="17";
		//without send keys
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//selectfuturedate(driver, date, month, year);
		//or
		selectfuturedate(driver,"17","April","2025");
		
		
		//driver.quit();

	}
	
	

}
