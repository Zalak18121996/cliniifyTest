package cliniify;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class AddPatientPage_UUID {

WebDriver driver;	
	
public 	AddPatientPage_UUID(WebDriver driver) {
	
	this.driver = driver;
}
	
//locators 

By btn_addPatient = By.xpath("//a[text()='Add Patient']");

By txt_firstName = By.xpath("//input[@id='formrow-firstname-input']");

By txt_miName = By.xpath("//input[@id='formrow-middlename-input']");

By txt_lastName = By.xpath("//input[@id='formrow-lastname-input']");
	
By txt_email = 	By.xpath("//input[@id='formrow-email-input']");

By txt_phone = By.xpath("//input[@id='formrow-phone-input']");
	
By txt_dob = By.xpath("//input[@id='formrow-dob-input']");

By txt_age = By.xpath("//input[@id='formrow-age-input']");

By drp_gender = By.xpath("//select[@id='formrow-gender-input']");

By drp_bldgrp = By.xpath("//select[@id='formrow-blood-input']");

By drp_ref = By.xpath("//select[@id='formrow-referred_by-input']");

By txt_adrs = By.xpath("//input[@id='formrow-address-input']");
	
By txt_city = By.xpath("//input[@id='formrow-city-input']");

By txt_pincd = By.xpath("//input[@id='formrow-pincode-input']");

By btn_save = By.xpath("//button[@class='btn btn-primary text-white w-md']");	
	
	
//methods	
	
public void clickAddPatient() {
	
	driver.findElement(btn_addPatient).click();
}	
	
public void enterFirstName(String fname) {
	
	driver.findElement(txt_firstName).sendKeys(fname);
}

public void enterMidlName(String mname) {
	
	driver.findElement(txt_miName).sendKeys(mname);
}

public void enterLstName(String lname) {
	
	driver.findElement(txt_lastName).sendKeys(lname);
}

public void enterEmail(String email) {
	
	driver.findElement(txt_email).sendKeys(email);
}	
	
	
public void enterPhone(String phone) {
	
	driver.findElement(txt_phone).sendKeys(phone);
}	
	
public void enterDob(String dob) {
	
	driver.findElement(txt_dob).sendKeys(dob);
}	
	
public void enterAge(int age) {
	
	driver.findElement(txt_age).sendKeys(String.valueOf(age));
}	
	
public void selectGender(String gender) {

	Select select = new Select(driver.findElement(drp_gender));
	select.selectByVisibleText(gender);
	
}	
	
public void selectBldGrp(String blood) {
	
	Select select = new Select(driver.findElement(drp_bldgrp));
	select.selectByVisibleText(blood);
}	
	
public void selectReferance(String ref) {
	
Select select = new Select (driver.findElement(drp_ref));
select.selectByVisibleText(ref);

}	
	
public void setAddress(String adrs) {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	driver.findElement(txt_adrs).sendKeys(adrs);
}	
	
public void setCity(String city) {
	
	driver.findElement(txt_city).sendKeys(city);
}

public void setPinCode(String pincode) {
	
	driver.findElement(txt_pincd).sendKeys(pincode);
}

public void clickSave() {
		
	driver.findElement(btn_save).click();
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,-1000)", "");
}	
	
}
