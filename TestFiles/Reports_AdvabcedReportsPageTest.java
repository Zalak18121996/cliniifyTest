package cliniifyTestNG;

import org.testng.annotations.Test;

import cliniify.LoginPage;
import cliniify.Reports_AdvancedReportsPage;

import org.openqa.selenium.*;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Reports_AdvabcedReportsPageTest {
  
	WebDriver driver;
	LoginPage loginPage;
	Reports_AdvancedReportsPage reports_AdvancedReportsPage;
	
	  @BeforeClass
	  public void launchBrowser() {
			 driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 driver.get("https://app.cliniify.com/#/login");	
			 driver.manage().window().fullscreen();

			 // Initialize page objects
			 loginPage = new LoginPage(driver);
			 reports_AdvancedReportsPage = new Reports_AdvancedReportsPage(driver);  

	  }
		
	@Test(priority= 1)
  public void login() throws InterruptedException {
		
	loginPage.login();
			
  }
		
@Test(priority= 2 ,enabled =true )
public void dailySummary() throws InterruptedException {
	
reports_AdvancedReportsPage.dailySummary();
	
}

	 @Test(priority= 3)
	 public void advReportCat_Income() throws InterruptedException {
		 
		 reports_AdvancedReportsPage.advReportsCat_Income();
	 }
	 
	 @Test(priority= 4)
	 public void advReportCat_Payment() throws InterruptedException {
		 
		 reports_AdvancedReportsPage.advReportsCat_Payments();
	 }
	 
	 @Test(priority= 5)
	 public void advReportCat_Appointment() throws InterruptedException {
		 
		 reports_AdvancedReportsPage.advReportsCat_Appointment();
	 }
	
	 @Test(priority= 6)
	 public void advReportCat_Patients() throws InterruptedException {
		 
		 reports_AdvancedReportsPage.advReportsCat_Patients();
	 }
	 
	 @Test(priority= 7)
	 public void advReportCat_ViewReport() throws InterruptedException {
		 
		 reports_AdvancedReportsPage.clickViewReport();
	 }

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}