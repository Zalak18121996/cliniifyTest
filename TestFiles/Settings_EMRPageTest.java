package cliniifyTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;

public class Settings_EMRPageTest {
	
	WebDriver driver;
	LoginPage loginPage;
	Settings_EMRPage settings_EMRPage;
	
	 @BeforeClass
	  public void launchBrowser() {
	
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://app.cliniify.com/#/login");
		 driver.manage().window().fullscreen();		
		 
		 loginPage = new  LoginPage(driver);
		 settings_EMRPage = new Settings_EMRPage(driver);
		 
	  }
	 
	 
	 
  @Test
  public void emrFunctionality() throws InterruptedException {
	  
	  loginPage.login();
      Thread.sleep(2000); 
  
      settings_EMRPage.complaint();
      settings_EMRPage.observation();
     settings_EMRPage.invastigation();
     settings_EMRPage.diagnosis();
     settings_EMRPage.notes();
      
      
	  
  }
 

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }

}
