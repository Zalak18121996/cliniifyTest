package cliniify;

import org.openqa.selenium.*;

public class Settings_EMRPage {

	WebDriver driver;
	
	String complaint = "Jaw Alignment";
	String editComplaint = "Jaw Pain";
	String observation = "Chewing Problem";
	String investigation = "Stress";
	String diagnosis = "Erosion";
	String editDiagnosis = "Hypersensitivity";
	String notes = "An X-ray of the aching tooth can help identify an abscess. Your dentist may also use X-rays to determine whether the infection has spread, causing abscesses in other areas.";
	
	public Settings_EMRPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
// Locators 
	
By btn_setting = By.xpath("//i[@class='bx bx-cog icons-font']");
	
By btn_EMR = By.xpath("//a[normalize-space()='EMR']");

By txt_complaints = By.xpath("//input[@placeholder='Enter Complaint Name']");

By btn_saveComplaints = By.xpath("//div[@id='complaint1']//button[@type='submit'][normalize-space()='Save']");

By btn_editComplaints = By.xpath("(//td[contains(text(),'Jaw Alignment')]/following-sibling::td/button/i)[1]");

By txt_editComplaint = By.xpath("//input[@class='form-control']");

By btn_editComplaintSave = By.xpath("//button[@class='btn btn-success mr-3']");

By btn_editComplaintDelete = By.xpath("(//td[contains(text(),'Jaw Pain')]/following-sibling::td/button/i)[2]");

By btn_observation = By.xpath("//span[normalize-space()='Observations']");

By txt_observation = By.xpath("//input[@placeholder='Enter Observation Name']");

By btn_observationSave = By.xpath("//div[@id='observation1']//button[@type='submit'][normalize-space()='Save']");
	
By btn_investigation = By.xpath("//span[normalize-space()='Investigations']");

By txt_investigation = By.xpath("//input[@placeholder='Enter Investigation Name']");

By btn_investigationSave = By.xpath("//div[@id='investigation1']//button[@type='submit'][normalize-space()='Save']");
	
By btn_diagnosis = By.xpath("//span[normalize-space()='Diagnosis']");

By txt_diagnosis = By.xpath("//input[@placeholder='Enter Diagnoses Name']");

By btn_diagnosisSave = By.xpath("//div[@id='diagnoses1']//button[@type='submit'][normalize-space()='Save']");
	
By btn_editDiagnosis = By.xpath("(//td[contains(text(),'Temporomandibular disorders')]/following-sibling::td/button/i)[1]");

By txt_editDiagnosis = By.xpath("//input[@class='form-control']");

By btn_editDiagnosisSave = By.xpath("//i[@class='mdi mdi-check-bold font-size-16 align-middle']");
	
By btn_notes = By.xpath("//span[normalize-space()='Notes']");

By txt_notes = By.xpath("//input[@placeholder='Enter Note Name']");

By btn_notesSave = By.xpath("//div[@id='notes1']//button[@type='submit'][normalize-space()='Save']");
	
	
//methods 

public void clickSettings() {
	
	driver.findElement(btn_setting).click();
}
	
public void clickEmr() {
	
	driver.findElement(btn_EMR).click();
		
}

public void enterComplaints() {
	
	driver.findElement(txt_complaints).sendKeys(complaint);
}

public void clickComplaintSave() {
	
	driver.findElement(btn_saveComplaints).click();
		
}

public void clickEditComplaint() {
	
	driver.findElement(btn_editComplaints).click();
		
}

public void enterEditComplaint() {
	
	WebElement compName = driver.findElement(txt_editComplaint);
	compName.clear();
	compName.sendKeys(editComplaint);
}

public void clickEditComplaintSave() {
	
	driver.findElement(btn_editComplaintSave).click();
		
}

public void clickEditComplaintDelete() throws InterruptedException {
	
	driver.findElement(btn_editComplaintDelete).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	driver.manage().window().fullscreen();
	
		
}

public void clickObservation() throws InterruptedException {
	
	driver.findElement(btn_observation).click();
		
}

public void enterObservation() throws InterruptedException {
	
	driver.findElement(txt_observation).sendKeys(observation);
}

public void clickObservationSave() {
	
	driver.findElement(btn_observationSave).click();
		
}

public void clickInvastigation() {
	
	driver.findElement(btn_investigation).click();
		
}

public void enterInvastigation() {
	
	driver.findElement(txt_investigation).sendKeys(investigation);
}

public void clickInvastigationSave() {
	
	driver.findElement(btn_investigationSave).click();
		
}

public void clickDiagnosis() {
	
	driver.findElement(btn_diagnosis).click();		
}

public void enterDiagnosis() {
	
	driver.findElement(txt_diagnosis).sendKeys(diagnosis);
}

public void clickDiagnosisSave() {
	
	driver.findElement(btn_diagnosisSave).click();		
}

public void clickEditDiagnosis() {
	
	driver.findElement(btn_editDiagnosis).click();
		
}

public void enterEditDiagnosis() {
	
	WebElement diagnos = driver.findElement(txt_editDiagnosis);
	diagnos.clear();
	diagnos.sendKeys(editDiagnosis);
}

public void clickEditDiagnosisSave() {
	
	driver.findElement(btn_editDiagnosisSave).click();
		
}

public void clickNotes() {
	
	driver.findElement(btn_notes).click();		
}

public void enterNotes() {
	
	driver.findElement(txt_notes).sendKeys(notes);
}

public void clickNotesSave() {
	
	driver.findElement(btn_notesSave).click();		
}



public void complaint() throws InterruptedException {
	
	clickSettings();
	Thread.sleep(3000);
	clickEmr();
	Thread.sleep(3000);
	enterComplaints();
	Thread.sleep(3000);
	clickComplaintSave();
	Thread.sleep(3000);
	clickEditComplaint();
	Thread.sleep(3000);
	enterEditComplaint();
	Thread.sleep(3000);
	clickEditComplaintSave();
	Thread.sleep(3000);
	clickEditComplaintDelete();
	Thread.sleep(3000);
}

public void observation() throws InterruptedException {

	clickObservation();
	Thread.sleep(3000);
	enterObservation();
	Thread.sleep(3000);
	clickObservationSave();
	Thread.sleep(3000);

}

public void invastigation() throws InterruptedException {
	
	clickInvastigation();
	Thread.sleep(3000);
	enterInvastigation();
	Thread.sleep(3000);
	clickInvastigationSave();
	Thread.sleep(3000);
	
}

public void diagnosis() throws InterruptedException {
	
	clickDiagnosis();
	Thread.sleep(3000);
	enterDiagnosis();
	Thread.sleep(3000);
	clickDiagnosisSave();
	Thread.sleep(3000);
	clickEditDiagnosis();
	Thread.sleep(3000);
	enterEditDiagnosis();
	Thread.sleep(3000);
	clickEditDiagnosisSave();
	Thread.sleep(3000);
		
}

public void notes() throws InterruptedException {
	
	clickNotes();
	Thread.sleep(3000);
	enterNotes();
	Thread.sleep(3000);
	clickNotesSave();
	Thread.sleep(3000);
	
}





}

















