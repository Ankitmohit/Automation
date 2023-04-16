package StepDefinitionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginstepdefinition {
	
	WebDriver driver;
	
	@Given ("user launch site URL ")
	public void user_launch_site_URL()
	
	{ 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		System.out.println("Action Performed");
	}
	
	@When (" user enter correct username and correct password")
	public void  user_enter_correct_username_and_correct_password()
	{
	    WebElement username = driver.findElement(By.xpath(""));
	    
	    username.sendKeys("Test");
	    
WebElement pass = driver.findElement(By.xpath(""));
	    
	    pass.sendKeys("12342424");
	    
	}
	
	@And (" click on login button ")
	public void  click_on_login_button()
	{
		WebElement loginbtn = driver.findElement(By.xpath(""));
	    
	    loginbtn.click();
	}
	
	@Then (" Validate user should navigate to home page. ")
	public void  Validate_user_should_navigate_to_home_page()
	{
		System.out.println("Testing");
	}
	
	
}
