package day3_25_04_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("pollanswers-1")).click();
		boolean poll = driver.findElement(By.id("pollanswers-1")).isSelected();
		System.out.println(poll);
		if(poll==true) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		

	}

}
