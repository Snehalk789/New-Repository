package day3_25_04_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));

		System.out.println(email.getAttribute("placeholder"));
		System.out.println(email.getTagName());

		WebElement loginBtn = driver.findElement(By.name("login"));
		System.out.println(loginBtn.getText());

	}

}
