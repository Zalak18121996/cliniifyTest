package cliniify;

import org.openqa.selenium.*;

public class PatientPage {

WebDriver driver;	

String note = "A legal document to assist in providing information to health plans, insurance and other payers for billing purposes or demonstrating a provider’s actions if questioned by a regulatory body or patient";

public 	PatientPage(WebDriver driver) {
	this.driver = driver;
}
	
// Locators


By btn_patient = By.xpath("//i[@class='bx bx-user-circle icons-font']");
	
By btn_patientName = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[5]/a[1]/div[1]/div[2]/div[1]");	
	
By btn_ptnNote = By.xpath("//button[normalize-space()='Edit']");	
	
By txt_addNote = By.xpath("//textarea[@placeholder='Add Notes']");	
	
By btn_done = By.xpath("//button[normalize-space()='Done']");
	
//methods


public void clickPatient() {
	
	driver.findElement(btn_patient).click();
}
	
public void clickptnName() {
	
	driver.findElement(btn_patientName).click();
}	

public void clickptnNoteEdit() {
	
	driver.findElement(btn_ptnNote).click();
}

public void addnote() {
	
	driver.findElement(txt_addNote).sendKeys(note);
}

public void clickdone() {
	
	driver.findElement(btn_done).click();
}

public void patient() throws InterruptedException {
	
	clickPatient();
	Thread.sleep(2000);	
	clickptnName();
	Thread.sleep(2000);
	clickptnNoteEdit();
	Thread.sleep(2000);
	addnote();
	Thread.sleep(2000);
	clickdone();
	
	
}


}
