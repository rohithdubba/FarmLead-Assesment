package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseclass.TestBase;



public class Combyne_loginTest extends TestBase{

	@BeforeTest
	public void init() throws IOException
	{
// committing to branch 
		//sharath bharath 
		// uday aditi
		//chinnu sammu
		// moving to branch
		setup();
	}
	@Test//This testmethod covers the testcases TC006,TC007
	public void login_TC006_TC009() throws InterruptedException
	{
		// ramlu nelulu
		//monu
		String before_url= driver.getCurrentUrl();
	WebElement email_id=driver.findElement(By.xpath("//div[@class='Onboard_fields__2N0VA']/div[1]/div/div/fieldset/div/input[@class='Input_input__3544m']"));
	email_id.sendKeys("rohithd.qa@gmail.com");
	WebElement password=driver.findElement(By.xpath("//div[@class='Onboard_fields__2N0VA']/div[2]/div/div/fieldset/div/input[@class='Input_input__3544m']"));
		password.sendKeys("Pranitha@123$");
	WebElement Next =driver.findElement(By.xpath("//input[@type='submit' and @value='Next']"));
		Next.click();

		String after_submission_URL= driver.getCurrentUrl();
		if(!(before_url.equals(after_submission_URL)))
		{
			boolean flag= true;
			Assert.assertTrue(flag);
			System.out.println("Sccessfully logged in");
		}
		else
		{
			
		
		System.out.println("******* Login not successful*******");
		// Error message validations
		
		
	WebElement errormsg=driver.findElement(By.xpath("//div[contains(text(),'Whoops! That email is not associated with an account.')]"));
	String error_message=errormsg.getText();
	boolean errorflg1=	errormsg.isDisplayed();
			
		if(errorflg1)	
			{
		System.out.println("invalid email Error message "+error_message+" is successfully displayed");
		Assert.assertTrue(errorflg1);
		System.out.println("Email Error messages are working as expected");
			}
		else {
			
			boolean errorflg2=	driver.findElement(By.xpath("//div[contains(text(),'wrong password')]")).isDisplayed();
			if(errorflg2)	
			{
		System.out.println(" wrongpassword Error message displayed");
		Assert.assertTrue(errorflg2);
		System.out.println("Password Error messages are working as expected");
			}		
		}
		}
		
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
	
	
	
	

