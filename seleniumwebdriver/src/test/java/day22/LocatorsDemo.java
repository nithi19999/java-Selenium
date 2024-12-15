package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//id
		
		//boolean lo = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(lo);
		
		//partial linkedText
		//driver.findElement(By.partialLinkText("Tablets")).click();// when u use partial link text u can use part of word ex.. tab(when there si no simalr link)
		//driver.findElement(By.linkText("Tablets")).click();//here u have to use full text 
		
		//className
		
//		List<WebElement> tLinks = driver.findElements(By.className("list-inline-item"));
//		System.out.println("total li ks in header:"+tLinks.size());//7
		
		//tagName
		
//		List<WebElement> Links = driver.findElements(By.tagName("a"));// for links always tagname is 'a'
//		System.out.println("total li ks in header:"+Links.size());//76
		
		List<WebElement> img = driver.findElements(By.tagName("img"));// for links always tagname is 'a'
		System.out.println("total  imgaes:"+img.size());//18
		
		Thread.sleep(1000);
		driver.close();

	}

}
