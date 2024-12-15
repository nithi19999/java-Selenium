package day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//rows in table
		int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println(rows);//7
		
		//column
		
		//int col = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		//System.out.println(col);
		
		//find tye particular row and column
		
		//String particular = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[4]/td[1]")).getText();
		//System.out.println(particular);//Learn JS
		
		//read all the table data
		/*for(int r = 2;r<=rows;r++) {
			System.out.println();
			
			for(int c=1;c<=col;c++) {
				String bookvalue = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
				
				System.out.print(bookvalue+ "\t");//\t tab space
			}
			System.out.println();
		}*/
		
		
		//print a abook name whos author is mukesh
		
		/*for(int r=2;r<=rows;r++) {
		String AuthorNAme = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
		if(AuthorNAme.equals("Mukesh")) {
			
			 String BookName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[1]")).getText();
			 
			 System.out.println(BookName+"\t"+AuthorNAme);
		}
		}*/
		
		// count the total price
		int total=0;
		for(int r=2;r<=rows;r++) {
			String price = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
		System.out.println(total);//7100
		
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
