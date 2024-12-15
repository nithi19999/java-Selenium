package day29;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowserwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		 Set<String> ww = driver.getWindowHandles();// we cant get from set hnce we conert to list
		
		 
		 //apporoch one 
		 
		/* List<String> wlist=new ArrayList(ww);
		 
		 String parent = wlist.get(0);
		String child = wlist.get(1);
		
		
		driver.getTitle();// it will print parent title 
		
		// if u want to print chld title
		
		driver.switchTo().window(child);
		 
		 System.out.println(driver.getTitle());//Human Resources Management Software | OrangeHRM
		 
		 
		 // switchto parent
		 
		 driver.switchTo().window(parent);
		 
		 System.out.println(driver.getTitle());//OrangeHRM
		 
		 //use of ID of browser window can do validations and switch to windows is easy
		 //syntax(driver.switchto().window(windowID)*/
		 
		 
		 // approch2(when u have many windows)
		 
		/* for(String winid:ww) {
			String title = driver.switchTo().window(winid).getTitle();//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
			 if(title.equals("OrangeHRM"));{
				 System.out.println(driver.getCurrentUrl());//https://www.orangehrm.com/
			 }
		 }*/
		 
		 for(String winid:ww) {
			 
			 @Nullable
			String title = driver.switchTo().window(winid).getTitle();
			 System.out.println(title);
			 
			 if(title.equals("OrangeHRM") || title.equals("some other title")) 
			 {
				 driver.close();// wehen u want to close particular window
			 }
		 }
		 
	
		 
		 
		// driver.quit();
	}

}
