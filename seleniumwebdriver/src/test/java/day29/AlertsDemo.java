package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		//normal alert with ok button
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		al.accept();*/
		
		
		// confirm or cancel
		
		/*driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();*/
		
		
		// prompt alerts- input box
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert al=driver.switchTo().alert();
		Thread.sleep(4000);
		al.sendKeys("nithi");
		
		al.accept();
		
		
		
		Thread.sleep(4000);
		driver.quit();

	}

}
