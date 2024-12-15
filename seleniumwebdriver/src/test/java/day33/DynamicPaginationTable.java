package day33;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//pagination
		
		int totalpages = driver.findElements(By.xpath("//ul[@id=\"pagination\"]//li")).size();
		
		
		
		//repeating [ages
		
		for(int p=1;p<=totalpages;p++) {
			
			if(p>1) {
				WebElement activepage = driver.findElement(By.xpath("//ul[@id=\"pagination\"]//*[text()="+p+"]"));
				activepage.click();
			}
			
			//reading
			
			int trow = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr")).size();
		
			
			for(int r=1;r<=trow;r++) {
				String name = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r+"]//td[2]")).getText();
				
				String price = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r+"]//td[3]")).getText();
				driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr[1]//td[4]")).click();
				
				System.out.println(name+"\t" +price);
			}
	
			
			
			
			
		}
		
		driver.quit();
		
	}

}
