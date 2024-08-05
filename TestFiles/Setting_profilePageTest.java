package cliniifyTestNG;

import org.testng.annotations.Test;

import cliniify.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Setting_profilePageTest {
	
	WebDriver driver;
	LoginPage loginPage;
	Setting_profilePage setting_profilePage;
	
	 @BeforeClass
	  public void launchBrowser() {
	
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		 driver.get("https://app.cliniify.com/#/login");
		 driver.manage().window().maximize();
		 
		 loginPage = new LoginPage(driver);
		 setting_profilePage = new Setting_profilePage(driver);
	  }
	 
  @Test
  public void settingsSetProfile() throws InterruptedException {
	  
	  loginPage.login();
	 setting_profilePage.setProfile(); 
  }
 

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }

}
