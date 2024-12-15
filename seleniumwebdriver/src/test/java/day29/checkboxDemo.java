package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//select one checkbox
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//multiple checkboxes
		
		List<WebElement> chkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		/*for(int i=0;i<=chkboxes.size();i++) {
			
			chkboxes.get(i).click();
		}*/
		
		//enhanced for loop
		
		//for(WebElement ck:chkboxes) {
			//ck.click();
			//break;
		//}
		
		// iw ant to slect last 3 checkboxes formula is 7-3=4
		
//		for(int i=4;i<=chkboxes.size();) {
//			chkboxes.get(i).click();
//		}
		
		// unselect
		
		for(int i=4;i<=chkboxes.size();) {
			if(chkboxes.get(i).isSelected())
			chkboxes.get(i).click();
		}
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}
