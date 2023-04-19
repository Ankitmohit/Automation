package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {
	
	public static void main(String[] args) {
		
		 
		
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//WebDriverManager.chromedriver().setup();

		//WebDriver driver = new ChromeDriver();


		
		driver.manage().window().maximize();
		
		driver.get("https://www.vuse.com/gb/en/customer/account/create/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logoHeading= driver.findElement(By.xpath("//div[@class='login_logo]/jljlkj"));
		
		String lopa = logoHeading.getText();
		System.out.println(lopa);
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement test= driver.findElement(By.xpath("//"));
		
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(test));
	test.click();
		
		//GitCheck
		
	}

}
