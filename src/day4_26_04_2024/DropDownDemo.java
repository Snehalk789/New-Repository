package day4_26_04_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

		WebElement day = driver.findElement(By.id("day"));
		Select se = new Select(day);
		se.selectByIndex(1);// select 2 date
		List<WebElement> alldays = se.getOptions();
		System.out.println(alldays.size());

		WebElement month = driver.findElement(By.id("month"));
		Select se1 = new Select(month);
		se1.selectByValue("7");
		// se1.selectByVisibleText("Jul");

		WebElement year = driver.findElement(By.id("year"));
		Select se2 = new Select(year);
		se2.selectByVisibleText("2000");

	}

}
