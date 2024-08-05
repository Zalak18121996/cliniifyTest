package cliniifyTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;
public class AppointmentPageTest {

	WebDriver driver;
	LoginPage loginPage;
	AppointmentPage appointmentPage;
	
	  @BeforeClass
	  public void beforeClass() {
	
		  driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 driver.get("https://app.cliniify.com/#/login");	
	     driver.manage().window().maximize();
	     
	     // Initialize page objects
		 loginPage = new LoginPage(driver);
		 appointmentPage = new AppointmentPage(driver);
		  
	  }
	  
  @Test
  public void editAppointment() throws InterruptedException {
	  
	  loginPage.login();
	  appointmentPage.Appoinment();
  }


  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }

}
