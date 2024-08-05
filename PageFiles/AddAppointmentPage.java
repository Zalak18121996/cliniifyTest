package cliniify;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddAppointmentPage {

WebDriver driver;	

String patientName = "Zalak";
String doctor = "Dr. Praveen Kumar";
String date = "20240715";
String time = "0915AM";
String duration = "20 Min";
String issue = "Toothache";
String proce = "RCT - Root Canal Therapy";
String descrip = "Need one more visit";



public AddAppointmentPage(WebDriver driver) {
	
	this.driver = driver;
}

// locators 

By btn_addPtn = By.xpath("//a[normalize-space()='Add Appointment']");

By txt_ptnName =By.xpath("//input[@placeholder='Enter Patient']") ; // xpath for Enter patient box

By btn_ptnName = By.xpath("//li[@id='patient_0']"); // xpath for patient name box in suggestion dropDown box 

By drp_Doc = By.xpath("//select[@id='doctor']");

By drp_Date = By.xpath("//input[@id='scheduled_date']");

By drp_Time = By.xpath("//input[@id='scheduled_time']");

By drp_duration = By.xpath("//select[@id='duration']");

By drp_Issue = By.xpath("//select[@id='common_issue']");

By drp_Procedure = By.xpath("//select[@id='procedure']");

By txt_Descrip = By.xpath("//input[@id='desc']");

By btn_Save = By.xpath("//button[normalize-space()='Save']");
	

// Action Methods 

public void clickAddPatient() {
	
	driver.findElement(btn_addPtn).click();
}

public void SetPatientName() {
	
	driver.findElement(txt_ptnName).sendKeys(patientName);  // enter patient name 1st
	
}

public void clickPatientName() {
	
	driver.findElement(btn_ptnName).click();  // 2nd click on suggestion drop drown to select _ not select type dropDown
}

public void selectDoctor() {
	
	Select select = new Select(driver.findElement(drp_Doc));

	select.selectByVisibleText(doctor);
	
}

public void selectDate() {

	//driver.findElement(drp_Date).clear();
	driver.findElement(drp_Date).sendKeys(date);
	//Select select = new Select(driver.findElement(drp_Date));

	//select.selectByVisibleText(date);
	
}

public void selectTime() {
	
	driver.findElement(drp_Time).sendKeys(time);
	
}

public void selectDuration() {
	
	Select select = new Select(driver.findElement(drp_duration));

	select.selectByVisibleText(duration);
	
}

public void selectIssue() {
	
	Select select = new Select(driver.findElement(drp_Issue));

	select.selectByVisibleText(issue);
	
}

public void selectProcedure() {
	
	Select select = new Select(driver.findElement(drp_Procedure));

	select.selectByVisibleText(proce);
	
}

public void setDescription() {
	
	driver.findElement(txt_Descrip).sendKeys(descrip);
}


public void clickSave() {
	
	JavascriptExecutor js =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)", "");
	driver.findElement(btn_Save).click();
}
	
public void addappointment() throws InterruptedException {
	
	clickAddPatient();
	Thread.sleep(2000);
	SetPatientName();
	Thread.sleep(2000);
	clickPatientName();
	Thread.sleep(2000);
	selectDoctor();
	Thread.sleep(2000);
	selectDate();
	Thread.sleep(2000);
	selectTime();
	Thread.sleep(2000);
	selectDuration();
	Thread.sleep(2000);	
	selectIssue();
	Thread.sleep(2000);
	selectProcedure();
	Thread.sleep(2000);
	setDescription();
	Thread.sleep(2000);
	clickSave();
	Thread.sleep(2000);
}	
	
	
	
}
