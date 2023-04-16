package com.test;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BootstrapDropDown {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.vuse.com/gb/en/customer/account/create");
		
		driver.manage().window().maximize();
		
		

      /*  WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		
		login.click(); */
		
		WebElement cookies =driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		
		cookies.click();
		
         WebElement age18 =driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']"));
		
		age18.click();
		
         WebElement genderDropdown=driver.findElement(By.xpath("//select[@id='gender']"));
         
         genderDropdown.click();
         
        List<WebElement> droplist= driver.findElements(By.xpath(""));
}
		
}
