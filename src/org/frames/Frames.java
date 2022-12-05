package org.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Practice\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		//driver.switchTo().frame("a077aa5e");
		//WebElement btnImage = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		//btnImage.click();
	
		//WebElement x = driver.findElement(By.id("a077aa5e"));
		//driver.switchTo().frame(x);
		//WebElement x1 = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
       //  x1.click();
         
         List<WebElement> list = driver.findElements(By.tagName("iframe"));
         int i = list.size();
         System.out.println(i);
       
	}

}
