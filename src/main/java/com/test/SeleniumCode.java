package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCode {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");

		//options.addArguments("--incognito");

		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.close();

		/*WebDriverManager.firefoxdriver().setup();

		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");

		//options.addArguments("--incognito");

		
		driver.manage().window().maximize();*/
		
		// driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("username");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("username");
		
		WebElement loginlogo=driver.findElement(By.xpath("//div[@class='login_logo']"));
		String logoActual=loginlogo.getText();
		System.out.println(logoActual);
		
		String Tabtile=driver.getTitle();
		
		System.out.println(Tabtile);
		//driver.findElement(By.xpath("//input[@id='user-name']"));
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		
		// Web element is a interface
		
		username.sendKeys("standard_user");
		
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		
		password.sendKeys("secret_sauce");
		
		
         WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		
		login.click();
		
		driver.close();
		
		
		
		
	}

}
