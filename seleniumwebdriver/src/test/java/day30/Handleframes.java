package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		WebElement frm = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frm);// frm as a webElemmnet
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("abc");
		
		driver.switchTo().defaultContent();//back to manin page or frmae
		
		// farme 2
		
		WebElement frm2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frm2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("nithi");
		driver.switchTo().defaultContent();
		
		//frame 3
		WebElement frm3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frm3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("nithi");
		
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();
		
		// by using java scrpt executor
		
		WebElement rdbtn = driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']"));
		
				JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", rdbtn);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
