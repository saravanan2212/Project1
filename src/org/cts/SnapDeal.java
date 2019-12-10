package org.cts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\greens tech\\saravanans\\Employy\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
	WebElement search = driver.findElement(By.id("inputValEnter"));
	search.sendKeys("iphone",Keys.ENTER);
	Thread.sleep(5000);
	List<WebElement> li = driver.findElements(By.xpath("//p[text()='iphone')]"));
	for (WebElement x : li) {
		String text = x.getText();
		System.out.println(text);
		
	}
	}

}
