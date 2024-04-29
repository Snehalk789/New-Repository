package day2_24_04_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassUrl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//open chrome browser
		driver.manage().window().maximize();//maximizing the window
		driver.get("https://www.facebook.com/");//passing the url
		
		System.out.println(driver.getCurrentUrl());
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();//getting title of Webpage
		System.out.println(actualTitle);//printing actual title
		//Comparing expectedTitle & actualTitle
		if(expectedTitle.equals(actualTitle)) 
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		driver.close();

	}

}
