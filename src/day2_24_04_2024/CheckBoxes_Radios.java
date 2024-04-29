package day2_24_04_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes_Radios {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//open chrome browser
		driver.manage().window().maximize();//maximizing the window
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		//selecting male radio button
		driver.findElement(By.id("male")).click();
		Thread.sleep(2000);
		//selecting a female radio button
		driver.findElement(By.id("female")).click();
		
		//selecting automation checkbox
		driver.findElement(By.className("Automation")).click();
		Thread.sleep(2000);
		//selecting performance checkbox
		driver.findElement(By.className("Performance")).click();
		

	}

}
