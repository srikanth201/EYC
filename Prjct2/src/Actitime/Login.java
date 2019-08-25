package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


	public class Login {
		
		@Test
		@Parameters({"username", "password"})
		
		public void Loginapp(String username, String password) throws InterruptedException
		{
			WebDriver driver=new FirefoxDriver();
			driver.get("http://localhost/login.do");
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			Thread.sleep(5000);
			
			driver.quit();
		}

	}


