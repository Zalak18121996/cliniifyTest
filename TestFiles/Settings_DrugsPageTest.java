package cliniifyTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;

public class Settings_DrugsPageTest {
	
	WebDriver driver;
	LoginPage loginPage;
	Settings_DrugsPage settings_DrugsPage;
	
	@BeforeClass
	  public void launchBrowser() {
		
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://app.cliniify.com/#/login");
		 driver.manage().window().fullscreen();		
		 
		 loginPage = new  LoginPage(driver);	
		 settings_DrugsPage = new Settings_DrugsPage(driver);
		
	  }
	
	
  @Test
  public void Drugs() throws InterruptedException {
	  
	  loginPage.login();
      Thread.sleep(2000); 
      
      settings_DrugsPage.drugs();
	  
	  
	  
	  
	  
  }
  

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }

}
