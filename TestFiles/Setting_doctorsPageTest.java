package cliniifyTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;

public class Setting_doctorsPageTest {
	
	WebDriver driver;
	LoginPage loginPage;
	Setting_doctorsPage setting_doctorsPage;
	
	@BeforeClass
	public void launchBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://app.cliniify.com/#/login");
		driver.manage().window().maximize();
		
		 loginPage = new LoginPage(driver);
		 setting_doctorsPage = new Setting_doctorsPage(driver);
	}
		
  @Test
  public void doctorsAddUser() throws InterruptedException {
	  
	 loginPage.login();
	 Thread.sleep(3000);
	 setting_doctorsPage.selectDoctors_Staff();
	// setting_doctorsPage.addExixtingUser();
	 setting_doctorsPage.addUser();
	 
  }
  
  
  
 @AfterClass
 public void tearDown() {
	 
	 driver.quit();
 }
  
}
