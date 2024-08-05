package cliniify;

import org.openqa.selenium.*;

public class Setting_profilePage {

WebDriver driver;

String tag = "We Care";
String adrs = "100,Desaiwad Road,Vapi";


public Setting_profilePage(WebDriver driver) {
	
	this.driver=driver;
}
	
// locators

By btn_setting = By.xpath("//i[@class='bx bx-cog icons-font']");

By btn_profile = By.xpath("//a[normalize-space()='Profile']");

By txt_tagline = By.xpath("//input[@id='tagline']");

By txt_adrs = By.xpath("//textarea[@id='address']");

By btn_save = By.xpath("//button[normalize-space()='Save']");
	

//methods 

public void clickSettings() {
	
	driver.findElement(btn_setting).click();
}
	
public void clickProfile() {
	
	driver.findElement(btn_profile).click();
}	
	
public void tagline() {
	
	driver.findElement(txt_tagline).sendKeys(tag);
}	
	
public void setAddress() {
	
	driver.findElement(txt_adrs).sendKeys(adrs);
}	
	
public void clickSave() {
	
	driver.findElement(btn_save).click();
}

public void setProfile() throws InterruptedException {
	
	clickSettings();
	Thread.sleep(2000);
	clickProfile();
	Thread.sleep(2000);
	tagline();
	Thread.sleep(2000);
	setAddress();
	Thread.sleep(2000);
	clickSave();
	Thread.sleep(2000);
			
}
	
}
