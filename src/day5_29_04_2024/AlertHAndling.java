package day5_29_04_2024;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHAndling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert Text:" + text);
		Thread.sleep(2000);
		alert.accept();

	}

}
