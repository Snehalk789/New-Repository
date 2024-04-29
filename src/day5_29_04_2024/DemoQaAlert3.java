package day5_29_04_2024;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaAlert3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("promtButton")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Snehal");
		Thread.sleep(2000);
		
		System.out.println(alert.getText());
		alert.accept();

	}

}
