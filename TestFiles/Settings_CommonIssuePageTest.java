package cliniifyTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;

public class Settings_CommonIssuePageTest {

	WebDriver driver;
	LoginPage loginPage;
	Settings_CommonIssuesPage settings_CommonIssuesPage;
	
	 @BeforeClass
	  public void launchBrowser() {
		 
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://app.cliniify.com/#/login");
		 driver.manage().window().maximize();
			
		 loginPage = new LoginPage(driver);
		 settings_CommonIssuesPage = new Settings_CommonIssuesPage(driver);
		 
	  }
	 
	 
  @Test
  public void commonIssues() throws InterruptedException {
	 
	  loginPage.login();
      
      settings_CommonIssuesPage.clickSettings();
      Thread.sleep(2000);
      settings_CommonIssuesPage.clickCommonIssues();
      Thread.sleep(3000);
      settings_CommonIssuesPage.enterIssueName();
      Thread.sleep(3000);
      settings_CommonIssuesPage.clickSave();
      Thread.sleep(3000);
      settings_CommonIssuesPage.clickEditComnIssue();
      Thread.sleep(3000);
      settings_CommonIssuesPage.enterEditComnIssue();
      Thread.sleep(3000);
      settings_CommonIssuesPage.clickEditComnIssueSave();
      Thread.sleep(3000);
	  
  }
 

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }

}
