 package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		
             options.addArguments("--incognito");

           WebDriver driver = new ChromeDriver(options);
           
           // webdriver is an interface
           // chromedriver is a class
           // alert----accept , dismiss , sendkeys
           
          // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
           
           driver.get("https://the-internet.herokuapp.com/javascript_alerts");
           
         //  WebElement test= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	       // test.click();
	        
	       // driver.switchTo().alert().accept();
	    
	       // Alert alert= driver.switchTo().alert();
	        
	       // alert.accept();
	 
	        
	       /* WebElement test2= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	        test2.click();
	        
	        Alert alert= driver.switchTo().alert();
	        
	        alert.accept();*/
	 
	        
	        WebElement test3= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
	        test3.click();
	        
	        Alert alert= driver.switchTo().alert();
	        
	        String text=alert.getText();
	        
	        System.out.println(text);
	        
	        alert.sendKeys("Ankit Mishra");
	        alert.accept();
	      //  Alert promptAlert  = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
	        //promptAlert.sendKeys("Accepting the alert");
	        
	 

	}

}