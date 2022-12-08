package org.WHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHand {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Practice\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
		
		WebElement txtSearch = driver.findElement(By.xpath("//input[@name='q']"));
		txtSearch.sendKeys("iphone",Keys.ENTER);
		Thread.sleep(3000);
		WebElement lnkIphone = driver.findElement(By.xpath("(//div[text()='APPLE iPhone 11 (Black, 128 GB)'])"));
		lnkIphone.click();
		String parrentWId = driver.getWindowHandle();
		System.out.println(parrentWId);
		Set<String> allWId = driver.getWindowHandles();
		System.out.println(allWId);
		
	
		
		System.out.println("addding method");
		System.out.println("Again adding method");
		for (String eachWid : allWId) {
			if (!parrentWId.equals(eachWid)) {
			driver.switchTo().window(eachWid);	
			}
		
		}
		WebElement btnAddToKart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		btnAddToKart.click();
	    
	}
	private void tc1() {
    System.out.println("admin");
	}

}
