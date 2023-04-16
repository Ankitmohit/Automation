package com.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {

	private static final boolean String = false;

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		
             options.addArguments("--incognito");

           WebDriver driver = new ChromeDriver(options);
           driver.manage().window().maximize();
           
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.get("https://www.hyrtutorials.com/p/window-handles-practise.html");
           
           String parentWindowID=driver.getWindowHandle();
           WebElement btn=driver.findElement(By.xpath("//button[@id='newTabsBtn"));
           btn.click();
           
           Set<String>childwindows=driver.getWindowHandles();
           
           int Ids=childwindows.size();
           
           System.out.println(Ids);
           
          
		for(String child:childwindows)
		{
			if(!parentWindowID.equals(childwindows))
			{
				driver.switchTo().window(child);
				
				String title = driver.getTitle();
				System.out.println(title);
				
				if(title.contains("Alerts Demo"));
				{
					driver.switchTo().window(child);
					
				driver.findElement(By.xpath("//button[@id='alertBox'")).click();
				
				break;
				}
			}
			
		}
		
		WebElement clikbtn= driver.findElement(By.xpath("//button[@id='alert']"));
		
		clikbtn.click();
	}
}
