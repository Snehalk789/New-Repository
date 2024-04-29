package day3_25_04_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@123");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		 List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
         int size=radios.size();
         System.out.println("No of radios:"+size);
         
         for(int i=0;i<size;i++) {
        	 radios.get(i).click();
         }
		
		
	}

}
