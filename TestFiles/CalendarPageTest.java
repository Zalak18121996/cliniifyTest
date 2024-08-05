package cliniifyTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;

public class CalendarPageTest {

	WebDriver driver;
	LoginPage loginPage;
	CalendarPage calendarPage;
	
	 @BeforeClass
	  public void launchBrowser() {
		 
	 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://app.cliniify.com/#/login");	
     driver.manage().window().maximize();
		 
		 // Initialize page objects
		 loginPage = new LoginPage(driver);
		 calendarPage =new CalendarPage(driver);
	  }
	 
	 
  @Test
  public void loginAndCalendarFunctionality() throws InterruptedException {
	  
	loginPage.login();
	Thread.sleep(2000);
	calendarPage.clickCalender();
	Thread.sleep(2000);
	
	 // Select date from calendar
	calendarPage.clickDatePicker();
	Thread.sleep(2000);
	calendarPage.selectFutureDate(driver, "15", "May", "2025");
	Thread.sleep(3000);
	
	 //Click on Month/Week/Day
	calendarPage.clickMonth();
	Thread.sleep(3000);
	calendarPage.clickWeek();
	Thread.sleep(3000);
	calendarPage.clickDay();
	Thread.sleep(3000);
	
    //Click on doc avail
	calendarPage.clickDocUnavail();
	Thread.sleep(3000);
	calendarPage.clickCalender();
	Thread.sleep(3000);
	  
	  	  
  }
 

  @AfterClass(enabled=true)
  public void tearDown() {
	  driver.quit();
  }

}
