package cliniify;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReportsPage {

	WebDriver driver;
	
	public ReportsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
// values
String category1 = "Income";
String category2 = "Payments";
String category3 = "Appointments";
String category4 = "Patients";
String category5 = "Due Amount";
String category6 = "Lab Dues";
String category7 = "References";
String category8 = "Material Usage";
String category9 = "Expenses";
String fromDate = "20240701";
String toDate = "20240730";
String ptnGrp = "NGO";
String doctor = "piyush";
String Procedures = "Teeth";
String expenType = "tea";
String expenVendor = "hotel";
	
//locators 

@FindBy(xpath= "//i[@class='bx bx-bar-chart-square icons-font']")
WebElement btn_Reports;

@FindBy(xpath= "//select[@class='form-control']")
WebElement drp_category;
	
@FindBy(xpath = "//div[@class='d-flex text-white align-items-center']//div[2]//input[1]")
WebElement frmDate;

@FindBy(xpath = "//div[@class='d-flex text-white align-items-center']//div[4]//input[1]")
WebElement todate;
	
@FindBy(xpath= "//input[@placeholder='Select Groups']")
WebElement txt_ptnGroup;

@FindBy(xpath= "//li[@id='groups_0']")
WebElement btn_ptnGroup;

@FindBy(xpath= "//input[@placeholder='Select Doctor']")
WebElement txt_doctor;

@FindBy(xpath= "//li[@id='doctors_0']")
WebElement btn_doctor;

@FindBy(xpath= "//input[@placeholder='Select Procedures']")
WebElement txt_procedure;

@FindBy(xpath= "//li[@id='procedures_0']")
WebElement btn_procedure;

@FindBy(xpath= "//li[@id='groups_multiple_option_0']//*[name()='svg']")
WebElement btn_clearptnGroup;

@FindBy(xpath= "//li[@id='doctors_multiple_option_0']//*[name()='svg']")
WebElement btn_clearDoctor;

@FindBy(xpath = "//li[@id='procedures_multiple_option_0']//*[name()='svg']")
WebElement btn_clearProcedure;

@FindBy(xpath= "//input[@placeholder='Select types']")
WebElement txt_expenType;

@FindBy(xpath= "//li[@id='expenseTypes_0']")
WebElement btn_expenType;

@FindBy(xpath= "//input[@placeholder='Select vendors']")
WebElement txt_expenVendor;

@FindBy(xpath= "//li[@id='expenseVendors_0']")
WebElement btn_expenVendor;


//Methods
public void clickReports() {
	
	btn_Reports.click();
}

//categories
public void selectCategory1() {
	
	Select sc = new Select(drp_category);
	sc.selectByVisibleText(category1);
}	
public void selectCategory2() {
	
	Select sc = new Select(drp_category);
	sc.selectByVisibleText(category2);
}	
public void selectCategory3() {
	
	Select sc = new Select(drp_category);
	sc.selectByVisibleText(category3);
}
public void selectCategory4() {
	
	Select sc = new Select(drp_category);
	sc.selectByVisibleText(category4);
}

public void selectCategory5() {
	
	Select sc = new Select(drp_category);
	sc.selectByVisibleText(category5);
}
public void selectCategory6() {
	
	Select sc = new Select(drp_category);
	sc.selectByVisibleText(category6);
}
public void selectCategory7() {
	
	Select sc = new Select(drp_category);
	sc.selectByVisibleText(category7);
}
public void selectCategory8() {
	
	Select sc = new Select(drp_category);
	sc.selectByVisibleText(category8);
}
public void selectCategory9() {
	
	Select sc = new Select(drp_category);
	sc.selectByVisibleText(category9);
}

//datePicker
public void setFromDate() {

	frmDate.sendKeys(fromDate);
}		
public void setToDate() {
	
	todate.sendKeys(toDate);
}	

//patient Group
public void enterPtientGroup() {
	
	txt_ptnGroup.sendKeys(ptnGrp);
}
public void selectPtientGroup() {
	
	btn_ptnGroup.click();
}
public void clearPtientGroup() {
	
	btn_clearptnGroup.click();
}

//Doctor
public void enterDoctor() {
	
	txt_doctor.sendKeys(doctor);
}
public void selectDoctor() {
	
	btn_doctor.click();
}
public void clearDoctor() {
	
	btn_clearDoctor.click();
}

//procedure
public void enterProcedure() {
	
	txt_procedure.sendKeys(Procedures);
}
public void selectProcedure() {
	
	btn_procedure.click();
}
public void clearProcedure() {
	
	btn_clearProcedure.click();
}

// expense Type 
public void enterExpenType() {
	
	txt_expenType.sendKeys(expenType);
}
public void selectExpenType() {
	
	btn_expenType.click();
}

//expense Vendor 
public void enterExpenVendor() {
	
	txt_expenVendor.sendKeys(expenVendor);
}
public void selectExpenVendor() {
	
	btn_expenVendor.click();
}

// methods for testPage 

public void cat1_Income() throws InterruptedException {
	
	clickReports();
	Thread.sleep(2000);
	selectCategory1();
	Thread.sleep(2000);
	setFromDate();
	//Thread.sleep(2000);
	setToDate();
	Thread.sleep(2000);
	enterPtientGroup();
	Thread.sleep(2000);
	selectPtientGroup();
	Thread.sleep(2000);
	enterDoctor();
	Thread.sleep(2000);
	selectDoctor();
	Thread.sleep(2000);
	enterProcedure();
	Thread.sleep(2000);
	selectProcedure();
	Thread.sleep(2000);
	clearPtientGroup();
	Thread.sleep(2000);
	clearDoctor();
	Thread.sleep(2000);
	clearProcedure();
	Thread.sleep(2000);	
}	
	
public void cat2_Payments() throws InterruptedException {
	selectCategory2();
	Thread.sleep(2000);
	enterPtientGroup();
	Thread.sleep(2000);
	selectPtientGroup();
	Thread.sleep(2000);
	clearPtientGroup();
	Thread.sleep(2000);
}

public void cat3_Appointments() throws InterruptedException {
	selectCategory3();
	Thread.sleep(2000);	
	enterPtientGroup();
	Thread.sleep(2000);
	selectPtientGroup();
	Thread.sleep(2000);
//	enterDoctor();
//	Thread.sleep(2000);
//	selectDoctor();
//	Thread.sleep(2000);
//	enterProcedure();
//	Thread.sleep(2000);
//	selectProcedure();
//	Thread.sleep(2000);
	clearPtientGroup();
	Thread.sleep(2000);
//	clearDoctor();
//	Thread.sleep(2000);
//	clearProcedure();
//	Thread.sleep(2000);
}

public void cat4_Patients() throws InterruptedException {
	selectCategory4();
	Thread.sleep(2000);	
	enterPtientGroup();
	Thread.sleep(2000);
	selectPtientGroup();
	Thread.sleep(2000);
	clearPtientGroup();
	Thread.sleep(2000);	
}

public void cat5_DueAmount() throws InterruptedException {
	selectCategory5();
	Thread.sleep(2000);
	enterPtientGroup();
	Thread.sleep(2000);
	selectPtientGroup();
	Thread.sleep(2000);
	clearPtientGroup();
	Thread.sleep(2000);		
}

public void cat6_LabDues() throws InterruptedException {
	selectCategory6();
	Thread.sleep(2000);
		
}

public void cat7_References() throws InterruptedException {
	selectCategory7();
	Thread.sleep(2000);
	enterPtientGroup();
	Thread.sleep(2000);
	selectPtientGroup();
	Thread.sleep(2000);
	clearPtientGroup();
	Thread.sleep(2000);		
}

public void cat8_MaterialUsage() throws InterruptedException {
	selectCategory8();
	Thread.sleep(2000);
		
}

public void cat9_Expenses() throws InterruptedException {
	selectCategory9();
	Thread.sleep(2000);
	enterExpenType();
	Thread.sleep(2000);
	selectExpenType();
	Thread.sleep(2000);
	enterExpenVendor();
	Thread.sleep(2000);
	selectExpenVendor();
	Thread.sleep(2000);		
}










	
}
