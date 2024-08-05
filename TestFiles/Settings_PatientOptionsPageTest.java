package cliniifyTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;

public class Settings_PatientOptionsPageTest {
	
	WebDriver driver;
	LoginPage loginPage;
	Settings_PatientOptionsPage settings_PatientOptionsPage;
	
	 @BeforeClass
	  public void launchBrowser() {
	
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://app.cliniify.com/#/login");
		 driver.manage().window().fullscreen();
			
		 loginPage = new LoginPage(driver);
		 settings_PatientOptionsPage = new Settings_PatientOptionsPage(driver);
		 		 
	  }
	 
  @Test
  public void patientOptions() throws InterruptedException {
	  
	  loginPage.login();
      Thread.sleep(3000);
      
      settings_PatientOptionsPage.references();  
      settings_PatientOptionsPage.medicalHistory();
     settings_PatientOptionsPage.patientGroup();
		 
  }
 
  @AfterClass
  public void tearDowwn() {
	  
	  driver.quit();
  }

}
