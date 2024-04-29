package day3_25_04_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailtxtBox=  driver.findElement(By.id("email"));
		if(emailtxtBox.isDisplayed()==true)
		{
			emailtxtBox.sendKeys("abcd");
		}
		
	boolean email=driver.findElement(By.id("email")).isDisplayed();
	System.out.println(email);
	
	if(email==true) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
    boolean password= driver.findElement(By.id("pass")).isEnabled();
    System.out.println(password);
	if(password==true) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	
	
	
	}

}
