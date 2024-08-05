package cliniify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

WebDriver driver;

// Login credentials and clinic selection
String email = "piyush@xirainfotech.com";
String password = "0000";
String clinic = "MS dental care";

// constructor
public LoginPage(WebDriver driver){
	
	this.driver = driver;
}
	
// locators 

By txt_email = By.xpath("//input[@id='email']");

By txt_password = By.xpath("//input[@id='userpassword']");

By btn_signin = By.xpath("//button[normalize-space()='Sign In']");

By drp_clinic = By.xpath("//select[@class='form-control']");

By btn_login = By.xpath("//button[normalize-space()='Login']");


// Action Methods

public void setUserEmail() {
	
	driver.findElement(txt_email).sendKeys(email);
}


public void setPassword() {
	
	driver.findElement(txt_password).sendKeys(password);
}
	
public void clickSignIn() {
	
	driver.findElement(btn_signin).click();
}	

public void selectClinic() {
	
Select select = new Select(driver.findElement(drp_clinic));

select.selectByVisibleText(clinic);

}

public void clickLogIn() {
	
	driver.findElement(btn_login).click();
}	

// method to use in logintest and where you need 

public void login() throws InterruptedException {

	setUserEmail();
	Thread.sleep(2000);	
	
	setPassword();
	Thread.sleep(2000);
	
	clickSignIn();
	Thread.sleep(2000);
	
	selectClinic();
	Thread.sleep(2000);
	
	clickLogIn();
	Thread.sleep(2000);
		
}

	
}
