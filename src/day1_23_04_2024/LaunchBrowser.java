package day1_23_04_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws Exception {
		
		//Instantiating the chromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximizing the window
		Thread.sleep(2000);//pause the execution for 2 sec
		driver.close();    //closing the window
		//WebDriver ==> interface
		//driver ==>instance of WebDriver
		//ChromeDriver ==> class
	
//		WebDriver d1=new FirefoxDriver();
//		
//		WebDriver d2=new EdgeDriver();
		
		
		
		
		
		
		
		

	}

}
