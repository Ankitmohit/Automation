package com.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandler2 {

	public static void main(String args[])
	{
		
        WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		
             options.addArguments("--incognito");

           WebDriver driver = new ChromeDriver(options);
           driver.manage().window().maximize();
           
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.get("https://www.hyrtutorials.com/p/window-handles-practise.html");
           
           String parentWindowID = driver.getWindowHandle();
           
           System.out.println(parentWindowID);
           
           //WebElement btn = (WebElement) driver.findElements(By.xpath("//button[@id='newWindowBtn']"));
           
           WebElement btn= (WebElement) driver.findElements(By.xpath("//button[@id='newtabBtn']"));
           
           btn.click();
           
           Set<String> childWindowID = driver.getWindowHandles();
           
           for(String child:childWindowID)
           {
        	   if(!parentWindowID.equals(childWindowID))
        	   {
        		 driver.switchTo().window(child);
        WebElement firstname= driver.findElement(By.xpath("//input[@id='firstname']"));
        
        firstname.sendKeys("Ankit");
        
        driver.close();
        
        driver.switchTo().window(parentWindowID);
        
         WebElement ele= driver.findElement(By.xpath("//input[@id='name']"));
        
         ele.sendKeys("Test");
        
        
        	   }
           }
          /* WebElement Username =driver.findElement(By.xpath("//input[@id='user-name']"));
           Username.sendKeys("standard_user");
           
           WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
           password.sendKeys("secret_sauce");  
           
           WebElement loginbtn =driver.findElement(By.xpath("//input[@id='login-button']"));
           loginbtn.click();*/  
           
           
           
           
           
	}
}
