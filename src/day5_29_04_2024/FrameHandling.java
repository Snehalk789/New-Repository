package day5_29_04_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.switchTo().frame(0);//handling first frame
		driver.findElement(By.linkText("java.applet")).click();
		
		driver.switchTo().defaultContent();//switch back
		
		driver.switchTo().frame("packageFrame");//switch to 2nd frame
		driver.findElement(By.linkText("Applet")).click();
		
		
		
		
       
	}

}
