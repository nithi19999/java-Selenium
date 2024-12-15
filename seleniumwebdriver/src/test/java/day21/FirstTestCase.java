package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		if(actTitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("failed");
		}
		
		driver.close();
		

	}

}
