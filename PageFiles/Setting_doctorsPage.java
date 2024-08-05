package cliniify;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Setting_doctorsPage {

WebDriver driver;
String user = "Dr. SONALI";
String roles1 = "Doctor";
String roles2_val = "14";
String roles2_val1 = "15";
String name = "Dr.Pooja Patel";
String designation = "Assistant Doctor";
String email = "desai@example.com";
String phone = "9843650241";
String password = "abc123";
String confmPassword = "abc123";
String color = "#EB8F0F";


public Setting_doctorsPage(WebDriver driver) {
	
	this.driver = driver;
}
	
//locators 

By btn_setting = By.xpath("//i[@class='bx bx-cog icons-font']");

By btn_doctors = By.xpath("//a[normalize-space()='Doctors/Staff']");

By btn_addUser = By.xpath("//a[normalize-space()='Add User']");

By drp_user = By.xpath("//body//div[@id='app']//div[@class='row']//div[@class='row']//div[1]//div[1]//select[1]");
	
By drp_roles1 = By.xpath("//div[@class='row']//div[2]//div[1]//select[1]");	
	
By btn_save1 = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]");	
	
By txt_name = By.xpath("//input[@id='formrow-fullname-input']");

By txt_designation = By.xpath("//input[@placeholder='Enter Designation']");

By txt_email = By.xpath("//input[@id='formrow-email-input']");

By txt_phone = By.xpath("//input[@id='formrow-phone-input']");

By txt_password = By.xpath("//input[@id='formrow-password-input']");

By txt_conPassword = By.xpath("//input[@id='formrow-confirm-password-input']");

By btn_color = By.xpath("//input[@id='color-input']");
	
By drp_roles2 = By.xpath("//div[@class='row my-2']//select[@id='formrole-inputState']");	
	
By btn_save2 = By.xpath("//form[@enctype='multipart/form-data']//button[@type='submit'][normalize-space()='Save']");	


// methods 

public void clickSettings() {
	
	driver.findElement(btn_setting).click();
}

public void clickDoctors() {
	
	driver.findElement(btn_doctors).click();
}

public void clickAddUser() {
	
	driver.findElement(btn_addUser).click();
}

public void selectUser() {
	
	Select select = new Select(driver.findElement(drp_user));
	select.selectByVisibleText(user);
}

public void selectRoles1() {
	
	Select select = new Select(driver.findElement(drp_roles1));
	select.selectByVisibleText(roles1);
}

public void clickSave1() {
	
	driver.findElement(btn_save1).click();
}

public void enterFullName() {
	
	driver.findElement(txt_name).sendKeys(name);
}

public void enterDesignation() {
	
	driver.findElement(txt_designation).sendKeys(designation);
}

public void enterEmail() {
	
	driver.findElement(txt_email).sendKeys(email);
}

public void enterPhone() {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	driver.findElement(txt_phone).sendKeys(phone);
}

public void enterPassword() {
	
	driver.findElement(txt_password).sendKeys(password);
}

public void enterConfirmPassword() {
	
	driver.findElement(txt_conPassword).sendKeys(confmPassword);
	
}

public void selectColor() {
	
WebElement colorPicker = driver.findElement(btn_color);

//colorElement.click();
//JavascriptExecutor js = (JavascriptExecutor)driver;
//js.executeScript("document.getElementById('color-input').value='#74981B'");
// Set the color value using JavaScript execution
String colorValue = "#ff5733";  // Replace with the desired color value
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].value = arguments[1];", colorPicker, colorValue);

// Optionally, trigger any change events if necessary
js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", colorPicker);
js.executeScript("arguments[0].dispatchEvent(new Event('change', { bubbles: true }));", colorPicker);

// Verify the color value is set
String setColorValue = colorPicker.getAttribute("value");
System.out.println("Color value set to: " + setColorValue);
	
}
public void selectRoles2() {
	
	Select select = new Select(driver.findElement(drp_roles2));
	List<WebElement> options = select.getOptions();
	System.out.println(options.size());
	
	if(select.isMultiple()) {
		select.selectByValue(roles2_val);
		select.selectByValue(roles2_val1);
	}
}

public void clickSave2() {
	
	driver.findElement(btn_save2).click();
}

public void selectDoctors_Staff() throws InterruptedException {
	
	clickSettings();
	Thread.sleep(2000);
	clickDoctors();
	Thread.sleep(2000);
	clickAddUser();
	Thread.sleep(2000);
}

public void addExixtingUser() throws InterruptedException {
	
	selectUser();
	Thread.sleep(2000);
	selectRoles1();
	Thread.sleep(2000);
	clickSave1();
	Thread.sleep(2000);
}

public void addUser() throws InterruptedException {
	
	enterFullName();
	Thread.sleep(2000);
	enterDesignation();
	Thread.sleep(2000);
	enterEmail();
	Thread.sleep(2000);
	enterPhone();
	Thread.sleep(2000);
	enterPassword();
	Thread.sleep(2000);
	enterConfirmPassword();
	Thread.sleep(2000);
	selectColor();
	Thread.sleep(2000);
	selectRoles2();
	Thread.sleep(2000);
	clickSave2();
	Thread.sleep(2000);
}







}
