package cliniify;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddPatientPage {

WebDriver driver;

String id = "3";
String firstName = "Aman";
String midName = "S";
String lastName = "Desai";
String email = "aman12@gmail.com";
String phone = "9876543210";
String secPhone = "9876543210";
String dob = "19800215";
String age = "44";
String gender = "Male";
String bloodGrp = "AB+";
String ref = "home friends";
String address = "101,Main Bajar";
String locality = "Main Bajar";
String city = "Pardi";
String pincode = "396050";


//constructor
public AddPatientPage(WebDriver driver){
	
	this.driver = driver;
}

// Locators 

By btn_addPt = By.xpath("//a[text()='Add Patient']");

By txt_ptID = By.xpath("//input[@id='formrow-patid-input']");

By txt_fstName = By.xpath("//input[@id='formrow-firstname-input']");

By txt_miName = By.xpath("//input[@id='formrow-middlename-input']");

By txt_lstName = By.xpath("//input[@id='formrow-lastname-input']");
	
By txt_email = 	By.xpath("//input[@id='formrow-email-input']");

By txt_phone = By.xpath("//input[@id='formrow-phone-input']");

By txt_secPhone = By.xpath("//input[@id='formrow-secondary_phone-input']");

By txt_dob = By.xpath("//input[@id='formrow-dob-input']");

By txt_age = By.xpath("//input[@id='formrow-age-input']");

By drp_gender = By.xpath("//select[@id='formrow-gender-input']");

By drp_bldgrp = By.xpath("//select[@id='formrow-blood-input']");

By drp_ref = By.xpath("//select[@id='formrow-referred_by-input']");

By txt_adrs = By.xpath("//input[@id='formrow-address-input']");

By txt_locality = By.xpath("//input[@id='formrow-locality-input']");

By txt_city = By.xpath("//input[@id='formrow-city-input']");

By txt_pincd = By.xpath("//input[@id='formrow-pincode-input']");

By btn_save = By.xpath("//button[@class='btn btn-primary text-white w-md']");


//Action Methods

public void clickAddPtn() {
	
	driver.findElement(btn_addPt).click();
}

public void setPtnID() {
	
	driver.findElement(txt_ptID).sendKeys(id);
}

public void setFirstName() {
	
	driver.findElement(txt_fstName).sendKeys(firstName);
}

public void setMidlName() {
	
	driver.findElement(txt_miName).sendKeys(midName);
}

public void setLstName() {
	
	driver.findElement(txt_lstName).sendKeys(lastName);
}

public void setEmail() {
	
	driver.findElement(txt_email).sendKeys(email);
}	
	
	
public void setPhone() {
	
	driver.findElement(txt_phone).sendKeys(phone);
}	
	
public void setSecPhone() {
	
	driver.findElement(txt_secPhone).sendKeys(secPhone);
}	
	
public void setDob() {
	
	driver.findElement(txt_dob).sendKeys(dob);
}	
	
public void setAge() {
	
	driver.findElement(txt_age).sendKeys(age);
}	
	
public void selectGender() {
	
	Select select = new Select(driver.findElement(drp_gender));

	select.selectByVisibleText(gender);
}

public void selectBldGrp() {
	
	Select select = new Select(driver.findElement(drp_bldgrp));

	select.selectByVisibleText(bloodGrp);
}

public void selectReferance() {
	
	Select select = new Select(driver.findElement(drp_ref));

	select.selectByVisibleText(ref);
}

public void setAddress() {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,800)", "");
	driver.findElement(txt_adrs).sendKeys(address);
}

public void setLocality() {
		
	driver.findElement(txt_locality).sendKeys(locality);
}

public void setCity() {
	
	driver.findElement(txt_city).sendKeys(city);
}

public void setPinCode() {
	
	driver.findElement(txt_pincd).sendKeys(pincode);
}

public void clickSave() {
		
	driver.findElement(btn_save).click();
}

public void addPatient() throws InterruptedException {
	
	clickAddPtn();
	Thread.sleep(2000);	
	setPtnID();
	Thread.sleep(2000);	
	setFirstName();
	Thread.sleep(2000);	
	setMidlName();
	Thread.sleep(2000);	
	setLstName();
	Thread.sleep(2000);
	setEmail();
	Thread.sleep(2000);
	setPhone();
	Thread.sleep(2000);
	setSecPhone();
	Thread.sleep(2000);	
	setDob();
	Thread.sleep(2000);
	setAge();
	Thread.sleep(2000);
	selectGender();
	Thread.sleep(2000);
	selectBldGrp();
	Thread.sleep(2000);
	selectReferance();
	Thread.sleep(2000);
	setAddress();
	Thread.sleep(2000);
	setLocality();
	Thread.sleep(2000);
	setCity();
	Thread.sleep(2000);
	setPinCode();
	Thread.sleep(2000);
	clickSave();
	Thread.sleep(2000);
	
	
}














}
