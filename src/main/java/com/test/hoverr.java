package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class hoverr {
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=584341161038&utm_campaign=Search-Brand-India&utm_campaigncode=BrowserStack-Alpha+9298040&utm_term=e+browserstack&gclid=Cj0KCQjwxMmhBhDJARIsANFGOSuD72YSSom2oCZKKQEZzKPEogWieezwo8mDONqj4ABR7cOHaJV2nz8aAnudEALw_wcB");
		
		WebElement test= driver.findElement(By.xpath("//span[@class='nav_item_name']"));
		
		WebElement searchbtn= driver.findElement(By.xpath("//button[@class='doc-search-menu dropdown-toggle doc-search-cta doc-search-menu-icon doc-menu-toggle']"));
		
		searchbtn.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(searchbtn));
		
		
		WebElement searchinput= driver.findElement(By.xpath("//input[@class='ais-SearchBox-input']"));
		
		//searchinput.sendKeys("Test");
		
		Actions act = new Actions(driver);
		act.moveToElement(searchinput);
		act.click();
		searchinput.sendKeys("Test");
		act.sendKeys(Keys.ENTER).build().perform();
		
		driver.quit();
		
		//searchinput.sendKeys(Keys.ENTER);
		
		
		/*Actions a = new Actions(driver);
		a.moveToElement(test);
		a.contextClick(test);
		a.click(test).build().perform();// build and perform function should be put in the last */
		
		
	}
	

}

