package cliniify;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Reports_AdvancedReportsPage {

	WebDriver driver;

//Constructor 
	public Reports_AdvancedReportsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

//input values	
	String fromDate = "20240701";
	String toDate = "20240730";	
	String Date = "0725";	
	String doctor = "Dr. Piyush Singh";
	String category1 = "Income";
	String category2 = "Payments";
	String category3 = "Appointments";
	String category4 = "Patients";
	
//Locators 
	@FindBy(xpath= "//i[@class='bx bx-bar-chart-square icons-font']")
	WebElement btn_Reports;
	
	@FindBy(xpath = "//a[normalize-space()='Daily Summary']")
	WebElement btn_DailySummary;
	
	@FindBy(css = "input[type='date']")
	WebElement date;
	
	@FindBy(xpath = "//select[@class='form-control']")
	WebElement drp_doctor;
	
	@FindBy(xpath = "//a[normalize-space()='Advanced Reports']")
	WebElement btn_advReports;

	@FindBy(xpath= "//select[@class='form-control']")
	WebElement drp_category;
	
	@FindBy(xpath = "//div[@class='d-flex text-white']//div[2]//input[1]")
	WebElement frmDate;

	@FindBy(xpath = "//div[@class='d-flex text-white']//div[4]//input[1]")
	WebElement todate;
	
	@FindBy(xpath = "//li[normalize-space()='Daily Invoiced Income']")
	WebElement btn_dailyInvo;
	
	@FindBy(xpath = "//li[normalize-space()='Monthly Invoiced Income']")
	WebElement btn_monthInvo;	

	@FindBy(xpath = "//li[normalize-space()='Invoiced Income For Each Doctor']")
	WebElement btn_doctInvo;
	
	@FindBy(xpath = "//li[normalize-space()='Invoiced Income For Each Procedure']")
	WebElement btn_procedureInvo;
	
	@FindBy(xpath = "//li[normalize-space()='Invoiced Income For Each Patient Group']")
	WebElement btn_ptnGroupInvo;
	
	@FindBy(xpath = "//li[normalize-space()='Payment Received Per Day']")
	WebElement btn_payPerDay;
	
	@FindBy(xpath = "//li[normalize-space()='Payment Received Per Month']")
	WebElement btn_payPerMonth;
	
	@FindBy(xpath = "//li[normalize-space()='Payment Received Per Doctor']")
	WebElement btn_payPerDoc;
	
	@FindBy(xpath = "//li[normalize-space()='Payment Received For Each Patient Group']")
	WebElement btn_payPerPtnGroup;
	
	@FindBy(xpath = "//li[normalize-space()='Daily Appointments Count']")
	WebElement btn_DailyAppoint;
	
	@FindBy(xpath = "//li[normalize-space()='Monthly Appointments Count']")
	WebElement btn_MonthlyAppoint;
	
	@FindBy(xpath = "//li[normalize-space()='Appointments For Each Doctor']")
	WebElement btn_AppointForDoc;
	
	@FindBy(xpath = "//li[normalize-space()='Appointments For Each Patient Group']")
	WebElement btn_AppointForPtnGroup;
	
	@FindBy(xpath = "//li[normalize-space()='Apoointments For Each Status']")
	WebElement btn_AppointForStatus;
	
	@FindBy(xpath = "//li[normalize-space()='Daily New Patients']")
	WebElement btn_DailyPtn;
	
	@FindBy(xpath = "//li[normalize-space()='Monthly New Patients']")
	WebElement btn_MonthlyPtn;
	
	@FindBy(xpath = "//li[normalize-space()='Patients For Each Patient Group']")
	WebElement btn_PtnForPtnGroup;
	
	@FindBy(xpath = "//a[normalize-space()='View Reports']")
	WebElement btn_ViewReport;
			
//method 
	public void clickReports() {
		
		btn_Reports.click();
	}
	
//Daily Summary method 
	public void clickDailySummary() {
		
		btn_DailySummary.click();
	}
	
	public void enterDate() {
		
		date.sendKeys(Date);
	}
	
	public void selectDoctor() {
		
		Select sc = new Select(drp_doctor);
		sc.selectByVisibleText(doctor);
	}
	
	public void navigateback() {
		
driver.navigate().back();				
	}

//Advanced Reports
	
public void clickAdvancedReports() {
		
		btn_advReports.click();
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
	
//datePicker
public void setFromDate() {

	frmDate.sendKeys(fromDate);
}		
public void setToDate() {
	
	todate.sendKeys(toDate);
}	
	
//income list 
public void clickDailyInvo() throws InterruptedException {
	
	btn_dailyInvo.click();	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(5000);

}
public void clickMonthInvo() throws InterruptedException {
		
	btn_monthInvo.click();		
}	
public void clickDoctorInvo() throws InterruptedException {
	
	btn_doctInvo.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(5000);
	
}	
public void clickProcedureInvo() throws InterruptedException {
			
	btn_procedureInvo.click();
		
}	
public void clickPtnGroupInvo() throws InterruptedException {
	
	btn_ptnGroupInvo.click();
		
}	
	
//Payments	
public void clickDailyPayment() {
	
	btn_payPerDay.click();	
}
public void clickMonthlyPayment() {
	
	btn_payPerMonth.click();	
}
public void clickPerDoctorPayment() {
	
	btn_payPerDoc.click();	
}
public void clickPerPtnGroupPayment() {
	
	btn_payPerPtnGroup.click();	
}

//Appointment
public void clickDailyAppoint() {
	
	btn_DailyAppoint.click();	
}
public void clickMonthlyAppoint() {
	
	btn_MonthlyAppoint.click();	
}
public void clickAppointForDoc() {
	
	btn_AppointForDoc.click();	
}
public void clickAppointForPtnGroup() {
	
	btn_AppointForPtnGroup.click();	
}
public void clickAppointForStatus() {
	
	btn_AppointForStatus.click();	
}

//Patients
public void clickDailyPtn() {
	
	btn_DailyPtn.click();	
}
public void clickMonthlyPtn() {
	
	btn_MonthlyPtn.click();	
}
public void clickPtnForPtnGroup() {
	
	btn_PtnForPtnGroup.click();	
}

//View Report 
public void clickViewReport() {
	
	btn_ViewReport.click();	
}

public void dailySummary() throws InterruptedException {
	
	clickReports();
	Thread.sleep(2000);
	clickDailySummary();
	Thread.sleep(2000);
	//enterDate();
	//Thread.sleep(2000);
	selectDoctor();
	Thread.sleep(2000);
	navigateback();
	Thread.sleep(2000);	
}	
	
public void advReportsCat_Income() throws InterruptedException {
	clickAdvancedReports();
	Thread.sleep(2000);
	selectCategory1();
	Thread.sleep(3000);	
	//setFromDate();
	//Thread.sleep(2000);
	//setToDate();
	//Thread.sleep(2000);
	clickDailyInvo();
	Thread.sleep(3000);
	clickMonthInvo();
	Thread.sleep(3000);
	clickDoctorInvo();
	Thread.sleep(3000);
	clickProcedureInvo();
	Thread.sleep(3000);
	clickPtnGroupInvo();
	Thread.sleep(3000);	
}	
	
public void advReportsCat_Payments() throws InterruptedException {
	
	selectCategory2();
	Thread.sleep(2000);	
	clickDailyPayment();
	Thread.sleep(3000);	
	clickMonthlyPayment();
	Thread.sleep(3000);
	clickPerDoctorPayment();
	Thread.sleep(3000);
	clickPerPtnGroupPayment();
	Thread.sleep(3000);
}	
	
public void advReportsCat_Appointment() throws InterruptedException{
	
	selectCategory3();
	Thread.sleep(2000);	
	clickDailyAppoint();
	Thread.sleep(3000);
	clickMonthlyAppoint();
	Thread.sleep(3000);
	clickAppointForDoc();
	Thread.sleep(3000);
	clickAppointForPtnGroup();
	Thread.sleep(3000);
	clickAppointForStatus();
	Thread.sleep(3000);	
}	

public void advReportsCat_Patients() throws InterruptedException{
	
	selectCategory4();
	Thread.sleep(2000);
	clickDailyPtn();
	Thread.sleep(3000);
	clickMonthlyPtn();
	Thread.sleep(3000);
	clickPtnForPtnGroup();
	Thread.sleep(3000);
	
}




}
