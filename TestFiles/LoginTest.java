package cliniifyTestNG;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import cliniify.*;

public class LoginTest {

WebDriver driver;	
LoginPage loginPage;
	
@BeforeClass
public void launchBrowser() {

	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.get("https://app.cliniify.com/#/login");	
	 driver.manage().window().maximize();
	 
	 // Initialize page objects
	 loginPage = new LoginPage(driver);
	
}
	
@Test(enabled=false)
public void loginFunctionality() throws InterruptedException {
	
	loginPage.login();
}
	
	
	
@AfterClass
public void closeBrowser() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}
	
	
	
	
	
	
	
}
