package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugessionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("movie");
		
		 List<WebElement> autooptions = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//li//span"));
		System.out.println("count of options"+autooptions.size());//count of options50
		
		for(WebElement dd:autooptions) {
			System.out.println(dd.getText());
			if(dd.getText().equals("movierulz 2024 -- download")) {
				dd.click();
				break;// if dont put break control sty in if loop
			}
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
