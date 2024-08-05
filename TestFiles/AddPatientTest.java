package cliniifyTestNG;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import cliniify.*;

public class AddPatientTest {

	WebDriver driver;
	LoginPage loginPage;
	AddPatientPage addPatientPage;
	
	 @BeforeTest
	  public void launchBrowser() {
	
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		 driver.get("https://app.cliniify.com/#/login");	
		 driver.manage().window().maximize();
		 
		 // Initialize page objects
		 loginPage = new LoginPage(driver);
		 addPatientPage = new AddPatientPage(driver);
		 		 
	  }	
	
  @Test
  public void loginAndAddPatient() throws InterruptedException {
	  
	  loginPage.login();
	  addPatientPage.addPatient();
  }
 

  @AfterTest
  public void tearDown() {
	  driver.quit();
  }

}
