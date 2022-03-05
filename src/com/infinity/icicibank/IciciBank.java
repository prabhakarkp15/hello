package com.infinity.icicibank;



import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IciciBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakar\\eclipse-workspace\\Bank\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("naveen53");
		WebElement findElement1 = driver.findElement(By.id("password"));
		findElement1.sendKeys("C1IZAU");
		WebElement findElement3 = driver.findElement(By.id("login"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.xpath("//*[@id=\'location\']"));
		Select select = new Select(findElement4);
		List<WebElement> options = select.getOptions();
	
		for (int i = 1; i < options.size(); i++) {

			   String dropdown_value = options.get(i).getText();

			   System.out.println("dropdown values are " + dropdown_value);

			 }

		
	}

}
