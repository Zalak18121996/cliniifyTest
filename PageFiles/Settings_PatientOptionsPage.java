package cliniify;

import org.openqa.selenium.*;

public class Settings_PatientOptionsPage {

WebDriver driver;

String referenceName = "Social Media";

String editName = "NRI References";

String history = "Migraine";

String ptnGroup = "Female";

String editHistory = "efgh";

String editPtnGroup = "Kids";

public Settings_PatientOptionsPage(WebDriver driver) {
	
	this.driver = driver;
}
	
// locators 

By btn_setting = By.xpath("//i[@class='bx bx-cog icons-font']");

By btn_ptnopn = By.xpath("//a[normalize-space()='Patient Options']");

By btn_ref = By.xpath("//a[@class='nav-link active']");

By txt_refName = By.xpath("//input[@placeholder='Enter Reference Name']");

By btn_refNameSave = By.xpath("//div[@id='contact1']//button[@type='submit'][normalize-space()='Save']");
	
By btn_editReference = By.xpath("(//td[contains(text(),'Social Media')]/following-sibling::td/button/i)[1]");

By txt_editReference = By.xpath("//table//input[@placeholder='Enter Reference Name']");

By btn_saveEditReference =By.cssSelector(".mdi-check-bold");

By btn_mediHistory = By.xpath("//div[@class='col-xl-9 col-lg-8']//li[2]//a[1]");
	
By txt_mediHistory = By.xpath("//input[@placeholder='Enter Medical History']");

By btn_savehistory = By.xpath("//div[@id='history1']//button[@type='submit'][normalize-space()='Save']");

By btn_editHistory = By.xpath("(//td[contains(text(),'Migraine')]/following-sibling::td/button/i)[1]");

By txt_editHistory = By.xpath("//input[@class='form-control']");

By btn_saveEditHistory = By.xpath("//button[@class='btn btn-success mr-3']");

By btn_ptnGroup = By.xpath("//div[@class='col-xl-9 col-lg-8']//li[3]//a[1]");

By txt_ptnGroup = By.xpath("//input[@placeholder='Enter Patient Group']");

By btn_savePtnGroup = By.xpath("//div[@id='group1']//button[@type='submit'][normalize-space()='Save']");

By btn_editPtnGroup = By .xpath("(//td[contains(text(),'Female')]/following-sibling::td/button/i)[1]");

By txt_editPtnGroup = By.xpath("//input[@class='form-control']");

By btn_saveEditPtnGroup = By.xpath("//i[@class='mdi mdi-check-bold font-size-16 align-middle']");

// methods 

public void clickSettings() {
	
	driver.findElement(btn_setting).click();
}
	
public void clickPatientOption() {
	
	driver.findElement(btn_ptnopn).click();
}	
	
public void clickReference() {
	
	driver.findElement(btn_ref).click();
}	
	
public void enterNewReferenceName() {
	
	driver.findElement(txt_refName).sendKeys(referenceName);
}	
	
public void clickReferenceSave() {
	
	driver.findElement(btn_refNameSave).click();
}	

public void clickFriendsEdit() {
	
	driver.findElement(btn_editReference).click();
}
	
public void editReferenceName() {
	
	WebElement refName = driver.findElement(txt_editReference);
	refName.clear();
	refName.sendKeys(editName);
}	

public void clickFriendssave() {
	
	driver.findElement(btn_saveEditReference).click();
}

public void clickMedicalHistory() {
	
	driver.findElement(btn_mediHistory).click();
}

public void enterMedicalHistory() {
	
	driver.findElement(txt_mediHistory).sendKeys(history);
}

public void clickHistorySave() {
	
	driver.findElement(btn_savehistory).click();
}

public void clickEditHistory() {
	
	driver.findElement(btn_editHistory).click();
}

public void enterEditHistory() {
	WebElement histEdit = driver.findElement(txt_editHistory);
	histEdit.clear();
	histEdit.sendKeys(editHistory);
}

public void clickEditHistorySave() {
	
	driver.findElement(btn_saveEditHistory).click();;
}

public void clickPatientGroup() {
	
	driver.findElement(btn_ptnGroup).click();
}

public void enterPatientGroup() {
	
	driver.findElement(txt_ptnGroup).sendKeys(ptnGroup);
}

public void clickPtnGroupSave() {
	
	driver.findElement(btn_savePtnGroup).click();
}

public void clickEditPtnGroup() {
	
	driver.findElement(btn_editPtnGroup).click();
}

public void enterEditPtnGroup() {
	WebElement histEdit = driver.findElement(txt_editPtnGroup);
	histEdit.clear();
	histEdit.sendKeys(editPtnGroup);
}

public void clickEditPtnGropuSave() {
	
	driver.findElement(btn_saveEditPtnGroup).click();;
}

public void references() throws InterruptedException {
	
	clickSettings();
	Thread.sleep(3000);
	clickPatientOption();
	Thread.sleep(3000);
	clickReference();
	Thread.sleep(2000);
	enterNewReferenceName();
	Thread.sleep(3000);
	clickReferenceSave();
	Thread.sleep(3000);
	clickFriendsEdit();
	Thread.sleep(3000);
	editReferenceName();
	Thread.sleep(4000);
	clickFriendssave();
	Thread.sleep(4000);
		
}

public void medicalHistory() throws InterruptedException {
	
	clickMedicalHistory();
	Thread.sleep(3000);
	enterMedicalHistory();
	Thread.sleep(3000);
	clickHistorySave();
	Thread.sleep(3000);
	clickEditHistory();
	Thread.sleep(3000);
	enterEditHistory();
	Thread.sleep(3000);
	clickEditHistorySave();	
	Thread.sleep(3000);
}
public void patientGroup() throws InterruptedException{
	
	clickPatientGroup();
	Thread.sleep(3000);
	enterPatientGroup();
	Thread.sleep(3000);
	clickPtnGroupSave();
	Thread.sleep(3000);
	clickEditPtnGroup();
	Thread.sleep(3000);
	enterEditPtnGroup();
	Thread.sleep(3000);
	clickEditPtnGropuSave();
	Thread.sleep(3000);
	
}






}
