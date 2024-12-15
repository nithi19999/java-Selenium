package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelecyDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select list=new Select(country);
		
		//list.selectByVisibleText("Canada");
		//list.selectByValue("germany");
		//list.selectByIndex(4);
		
		// find all the options
		
		List<WebElement> opt = list.getOptions();
		//System.out.println("size of options"  +opt.size());
		
		//use for loop
		
		//for(int i=0;i<opt.size();i++) {
			//System.out.println(opt.get(i).getText());
		//}
		
		//  for enhanced for loop
		
		for(WebElement tt:opt) {
			System.out.println(tt.getText());
		}
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
