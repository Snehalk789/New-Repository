package day4_26_04_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DubleClick_RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		
		Actions act=new Actions(driver);
		email.sendKeys("Snehal Kolhe");
		Thread.sleep(3000);
		//act.doubleClick().build().perform();
		act.doubleClick(email).build().perform();//double clicking on text
		act.contextClick(email).build().perform();//right click on text
		
	}

}
