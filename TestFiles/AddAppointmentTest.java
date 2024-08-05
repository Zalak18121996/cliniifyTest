package cliniifyTestNG;

import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;

public class AddAppointmentTest {
	
	WebDriver driver;
	LoginPage loginPage;
	AddAppointmentPage addAppointmentPage;
	CalendarPage calendarPage;
		
	  @BeforeClass
	  public void launchBrowser() {
			 driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			 driver.get("https://app.cliniify.com/#/login");	
			 driver.manage().window().maximize();
			 
			 // Initialize page objects
			 loginPage = new LoginPage(driver);
			 addAppointmentPage = new 	AddAppointmentPage(driver);
			 calendarPage = new CalendarPage(driver); 
		  	  		  
	  }
	  
  @Test
  public void loginAndAddappointment() throws InterruptedException {
	
	  loginPage.login();
	  calendarPage.clickCalender();
	  addAppointmentPage.addappointment();
	  	  
  }

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }

}
