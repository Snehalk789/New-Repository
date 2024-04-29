package day2_24_04_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//open chrome browser
		driver.manage().window().maximize();//maximizing the window
		driver.get("https://www.facebook.com/");
		
		///locating email textbox & sending the value in textbox
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		///locating password textbox & sending the value in textbox
		driver.findElement(By.name("pass")).sendKeys("abc@123");
		
		//driver.findElement(By.name("login")).click();
		
	}

}
