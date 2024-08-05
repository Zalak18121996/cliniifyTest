package cliniifyTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;

public class PatientPageTest {
	
	WebDriver driver;
	LoginPage loginPage;
	PatientPage patientPage;
	
	 @BeforeClass
	  public void beforeClass() {
	
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://app.cliniify.com/#/login");	
		 driver.manage().window().maximize();
		 
		 // Initialize page objects
		 loginPage = new LoginPage(driver);
		 patientPage = new PatientPage(driver);
		 		 
	  }
	 
  @Test
  public void patientSelect() throws InterruptedException {
	  
	loginPage.login();  
	patientPage.patient();
	  	  
  }
 

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }

}
