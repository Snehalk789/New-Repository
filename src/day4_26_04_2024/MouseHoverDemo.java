package day4_26_04_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//mouse hovering on computers tab
		WebElement computers=driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(computers).build().perform();
		Thread.sleep(2000);
		
		//mouse hovering on electronics tab
		WebElement electronics=driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]"));
        act.moveToElement(electronics).build().perform();
		
//        
//        Action serriesOfactions=(Action) act.moveToElement(electronics).contextClick().build();
//        serriesOfactions.perform();
//		
	}

}
