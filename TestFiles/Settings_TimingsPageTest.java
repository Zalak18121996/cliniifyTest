package cliniifyTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;

public class Settings_TimingsPageTest {
	
	WebDriver driver;
	LoginPage loginPage;
	Settings_TimingsPage settings_TimingsPage;
	
	 @BeforeClass
	  public void launchBrowser() throws InterruptedException {
	
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://app.cliniify.com/#/login");
		 driver.manage().window().maximize();
			
		 loginPage = new LoginPage(driver);
		 settings_TimingsPage = new Settings_TimingsPage (driver);
		 
	  }
	 
  @Test
  public void timingsEdit() throws InterruptedException {
	  
	 loginPage.login();
	 Thread.sleep(4000);
	 settings_TimingsPage.clickSettings();
	 Thread.sleep(2000);
	 settings_TimingsPage.clickTimings();
	 Thread.sleep(2000);
	 settings_TimingsPage.clickEdit();
	 Thread.sleep(2000);
	 settings_TimingsPage.clickDay();
	 Thread.sleep(4000);
	 settings_TimingsPage.clickBreak();
	 Thread.sleep(4000);
	 settings_TimingsPage.enterStartTime();
	 Thread.sleep(4000);
	 settings_TimingsPage.enterBreakTime();
	 Thread.sleep(4000);
	 settings_TimingsPage.enterresumeTime();
	 Thread.sleep(4000);
	 settings_TimingsPage.enterLeaveTime();
	 Thread.sleep(4000);
	 settings_TimingsPage.clickCopyDays();
	 Thread.sleep(4000);
	 settings_TimingsPage.clickSave();
	 Thread.sleep(4000);
	  	  
	  
  }
 

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }

}
