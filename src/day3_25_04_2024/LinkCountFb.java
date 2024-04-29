package day3_25_04_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountFb {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int totalCount = allLinks.size();
		System.out.println("Total no of links:" + totalCount);

		for(int i=0;i<totalCount;i++) {
			System.out.println(allLinks.get(i).getText()+"==> "+allLinks.get(i).getAttribute("href"));
		}
	}

}
