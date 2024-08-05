package cliniify;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class AppointmentPage {

	WebDriver driver;

	String procedure = "Molar Extraction";
	String status = "Rescheduled";

	// constructor 
	public AppointmentPage(WebDriver driver) {
		
		this.driver = driver;
	}

	//locators
	By btn_appointment = By.xpath("//i[@class='bx bx-food-menu icons-font']");
	
	By btn_edit = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/a[1]");
	
	By drp_procedure = By.xpath("//select[@id='procedure']");
	
	By drp_status = By.xpath("//select[@id='astatus']");
	
	By btn_save = By.xpath("//button[normalize-space()='Save']");
	
//methods 
public void clickAppointment() {
		
		driver.findElement(btn_appointment).click();
	}
	
public void clickEdit() {
	
	driver.findElement(btn_edit).click();
}	
	
public void editProcedure() {

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	Select select = new Select(driver.findElement(drp_procedure));
	select.selectByVisibleText(procedure);
}	
	
public void editStatus() {

	Select select = new Select(driver.findElement(drp_status));
	select.selectByVisibleText(status);
}	
	
public void clickSave() {
	
	driver.findElement(btn_save).click();
}	
	
public void Appoinment() throws InterruptedException {
	
clickAppointment();
Thread.sleep(2000);
clickEdit();
Thread.sleep(2000);
editProcedure();
Thread.sleep(2000);
editStatus();
Thread.sleep(2000);
clickSave();
Thread.sleep(2000);
}
}