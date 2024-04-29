package day2_24_04_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextDemo {

	public static void main(String[] args) throws Exception  {
		WebDriver driver=new ChromeDriver();//open chrome browser
		driver.manage().window().maximize();//maximizing the window
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.partialLinkText("Create new")).click();
		Thread.sleep(2000);///pausing the execution for 2 sec 
		driver.findElement(By.name("firstname")).sendKeys("Snehal");
		//driver.findElement(By.name("firstname")).clear();
		
		//selecting value from day 
		driver.findElement(By.id("day")).sendKeys("25");
		
		
		
	}

}
