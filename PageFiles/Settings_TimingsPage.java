package cliniify;

import org.openqa.selenium.*;

public class Settings_TimingsPage {

WebDriver driver;

String startTime = "0915AM";
String breakTime = "1230PM";
String resumeTime = "0130PM";
String leaveTime = "0800PM";

public Settings_TimingsPage(WebDriver driver) {
	
	this.driver = driver;
}
	
//locators  

By btn_setting = By.xpath("//i[@class='bx bx-cog icons-font']");

By btn_timings = By.xpath("//a[normalize-space()='Timings']");

By btn_edit = By.xpath("//tbody/tr[3]/td[3]/a[1]");

By btn_day = By.xpath("//label[normalize-space()='I Visit this Clinic on Sunday']");

By btn_break = By.xpath("//label[normalize-space()='I take a break for lunch']");

By drp_start = By.xpath("//div[@class='d-flex mb-2']//div[@class='mr-4']//input[@type='time']");

By drp_break = By.xpath("//div[@class='d-flex mb-2']//div[4]//input[1]");

By drp_resume = By.xpath("//div[@class='d-flex']//div[2]//input[1]");

By drp_leave = By.xpath("//div[@class='d-flex']//div[4]//input[1]");

By btn_copy = By.xpath("//a[normalize-space()='Copy to all other days']");

By btn_save = By.xpath("//button[normalize-space()='Save']");	
	

// methods 

public void clickSettings() {
	
	driver.findElement(btn_setting).click();
}
	
public void clickTimings() {
	
	driver.findElement(btn_timings).click();
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)", "");
}
		
public void clickEdit() {
	
	driver.findElement(btn_edit).click();
}
		
public void clickDay() {
	
	driver.findElement(btn_day).click();
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)", "");
}
		
public void clickBreak() {
	
	driver.findElement(btn_break).click();
}
		
public void enterStartTime() {
	WebElement time = driver.findElement(drp_start);
	time.clear();
	time.sendKeys(startTime);;
}
	
public void enterBreakTime() {
	WebElement btime=driver.findElement(drp_break);
	btime.clear();
	btime.sendKeys(breakTime);
}

public void enterresumeTime() {
	WebElement rtime = driver.findElement(drp_resume);
	rtime.clear();
	rtime.sendKeys(resumeTime);
}

public void enterLeaveTime() {
	WebElement ltime = driver.findElement(drp_leave);
	ltime.clear();
	ltime.sendKeys(leaveTime);;
}

public void clickCopyDays() {
	
	driver.findElement(btn_copy).click();
}

public void clickSave() {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)", "");
	driver.findElement(btn_save).click();
}




}
