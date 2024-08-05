package cliniify;

import org.openqa.selenium.*;

public class PatientPageSidePanel {

WebDriver driver; 	

	
public 	PatientPageSidePanel(WebDriver driver) {
	
	this.driver = driver;
}

// Locators 

By btn_family = By.xpath("//div[@class='row']//div[3]//ul[1]//li[1]//a[1]");

By btn_ngo = By.xpath("//div[@class='row']//div[3]//ul[1]//li[2]//a[1]");

By btn_nonLoc = By.xpath("//div[@class='row']//div[3]//ul[1]//li[3]//a[1]");

By btn_govemp = By.xpath("//div[@class='row']//div[3]//ul[1]//li[4]//a[1]");

By btn_vip = By.xpath("//div[@class='row']//div[3]//ul[1]//li[5]//a[1]");

By btn_vapi = By.xpath("//div[@class='row']//div[3]//ul[1]//li[6]//a[1]");

By btn_locality = By.xpath("//div[@class='row']//div[3]//ul[1]//li[7]//a[1]");

By btn_femaleptn = By.xpath("//div[@class='row']//div[4]//ul[1]//li[1]//a[1]");

By btn_allfemlnext = By.xpath("//button[normalize-space()='Next']");

By btn_allFemlePrevs = By.xpath("//button[normalize-space()='Prev']");

By btn_maleptn = By.xpath("//div[@class='row']//div[4]//ul[1]//li[2]//a[1]");

By btn_malenext = By.xpath("//button[normalize-space()='Next']");

By btn_malenext2 = By.xpath("//button[normalize-space()='Next']");

By btn_maleprevs2 = By.xpath("//button[normalize-space()='Prev']");

By btn_maleprevs = By.xpath("//button[normalize-space()='Prev']");

By btn_femaleovr30 = By.xpath("//div[@class='row']//div[4]//ul[1]//li[3]//a[1]");

By btn_femaleundr30 = By.xpath("//div[@class='row']//div[4]//ul[1]//li[4]//a[1]");	
	
	
public void clickFamily() {

	driver.findElement(btn_family).click();
}

public void clickNgo() {
	JavascriptExecutor js =  (JavascriptExecutor)driver;	
	js.executeScript("window.scrollBy(0,150)", "");
	driver.findElement(btn_ngo).click();
}

public void clickNonLocality() {
	
	driver.findElement(btn_nonLoc).click();
}

public void clickGovtEmp() {
	
	driver.findElement(btn_govemp).click();
}

public void clickVip() {
	
	driver.findElement(btn_vip).click();
}	
	
public void clickVapi() {
	
	driver.findElement(btn_vapi).click();
}

public void clickLocality() {
	
	driver.findElement(btn_locality).click();
}

public void clickFemalePatient() {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)", "");
	driver.findElement(btn_femaleptn).click();
}

public void clicAllFemaleNext() {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)", "");
	driver.findElement(btn_allfemlnext).click();
}

public void clicAllFemalePrevious() {
	
	driver.findElement(btn_allFemlePrevs).click();
}

public void clickMalePtient() {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,-300)", "");	
	driver.findElement(btn_maleptn).click();
}

public void clickMaleNext() {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,800)", "");
	driver.findElement(btn_malenext).click();
}

public void clickMaleNext2() {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,800)", "");	
	driver.findElement(btn_malenext2).click();
}

public void clickMalePrevious2(){
	
	driver.findElement(btn_maleprevs2).click();
}

public void clickMalePrevious(){
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,600)", "");	
	driver.findElement(btn_maleprevs).click();
}

public void clickFemaleovr30() {
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,-400)", "");	
	driver.findElement(btn_femaleovr30).click();
}

public void clickFemaleunder30() {
	
	driver.findElement(btn_femaleundr30).click();
}

public void patientPageSidePannel() throws InterruptedException {
	
	clickFamily();
	Thread.sleep(3000);
	clickNgo();
	Thread.sleep(3000);
	clickNonLocality();
	Thread.sleep(3000);
	clickGovtEmp();
	Thread.sleep(3000);
	clickVip();
	Thread.sleep(3000);
	clickVapi();
	Thread.sleep(3000);
	clickLocality();
	Thread.sleep(3000);
	clickFemalePatient();
	Thread.sleep(3000);
	clicAllFemaleNext();
	Thread.sleep(3000);
	clicAllFemalePrevious();
	Thread.sleep(3000);
	clickMalePtient();
	Thread.sleep(3000);
	clickMaleNext();
	Thread.sleep(3000);
	clickMaleNext2();
	Thread.sleep(3000);
	clickMalePrevious2();
	Thread.sleep(3000);
	clickMalePrevious();
	Thread.sleep(4000);
	clickFemaleovr30();
	Thread.sleep(3000);
	clickFemaleunder30();
		
}
	
}
