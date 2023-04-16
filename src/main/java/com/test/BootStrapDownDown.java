package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDownDown {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	
		
		//WebDriverManager.chromedriver().setup();

		//WebDriver driver = new ChromeDriver();


		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		
		WebElement dropdown=driver.findElement(By.xpath("//button[@id='menu1']"));
		
		 // dropdown.click();
		    
		List<WebElement> dropdownlist=  driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));

		
		for(WebElement test :dropdownlist){
			
			//int dropdownn= dropdownlist.size();
			
			//System.out.println(dropdownn);
			
		 dropdown.click();
		 String value= test.getText();
		 System.out.println(value);
		 if(value.equals("JavaScript")) {
		   test.click();
		   break;
		 }
		   //Thread.sleep(2000);
	}
		  
	}
	}