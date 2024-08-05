package cliniifyTestNG;

import org.testng.annotations.Test;

import cliniify.LoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;

public class ReportsPageTest {
  
WebDriver driver;	
LoginPage loginPage;
ReportsPage reportsPage;
	
	 @BeforeClass
	  public void launchBrowser() {
		 
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://app.cliniify.com/#/login");	
		 driver.manage().window().fullscreen();
		 
		 // Initialize page objects
		 loginPage = new LoginPage(driver);
		 reportsPage = new ReportsPage(driver);
	  }	
	
	 
	@Test(priority= 1)
  public void reportsPageCategory1() throws InterruptedException {
		
	loginPage.login();
	reportsPage.cat1_Income();
	
  }
 @Test(priority= 2)
 public void reportsPageCategory2() throws InterruptedException {
	 
		reportsPage.cat2_Payments();
 }
 @Test(priority= 3)
 public void reportsPageCategory3() throws InterruptedException {
	 
		reportsPage.cat3_Appointments();
 }
 
 @Test(priority= 4)
 public void reportsPageCategory4() throws InterruptedException {
	 
		reportsPage.cat4_Patients();
 } 
 
 @Test(priority= 5)
 public void reportsPageCategory5() throws InterruptedException {
	 
		reportsPage.cat5_DueAmount();
 } 
 
 @Test(priority= 6)
 public void reportsPageCategory6() throws InterruptedException {
	 
		reportsPage.cat6_LabDues();
 } 
 
 @Test(priority= 7)
 public void reportsPageCategory7() throws InterruptedException {
	 
		reportsPage.cat7_References();
 } 
 
 @Test(priority= 8)
 public void reportsPageCategory8() throws InterruptedException {
	 
		reportsPage.cat8_MaterialUsage();
 } 
 
 @Test(priority= 9)
 public void reportsPageCategory9() throws InterruptedException {
	 
		reportsPage.cat9_Expenses();
 } 
 
  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }

}
