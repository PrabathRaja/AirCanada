package org.webtable;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Practice\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < tableRows.size(); i++) {
			WebElement tableRow = tableRows.get(i);

			List<WebElement> tableHeaders = tableRow.findElements(By.tagName("th"));
			for (int j = 0; j <tableHeaders.size(); j++) {
				WebElement THeader = tableHeaders.get(j);
				String text2 = THeader.getText();
				System.out.println(text2);
				
			}
		}
	
		
	}
}
