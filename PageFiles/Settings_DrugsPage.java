package cliniify;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Settings_DrugsPage {

	WebDriver driver;
	
	String drugName = "Naproxen";
	String strength = "500";
	String instruction = "Toothaches Relife ";
	String instruction1 = "Toothaches Relife and fever";
	
	public Settings_DrugsPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
// Locators
	
	By btn_setting = By.xpath("//i[@class='bx bx-cog icons-font']");
	
	By btn_drugs = By.xpath("//a[normalize-space()='Drugs']");
	
	By btn_addDrugs = By.xpath("//a[normalize-space()='Add Drug']");
	
	By txt_drugName = By.id("drug_name");
	
	By drp_drugType = By.xpath("//div[@class='card-body']//div[1]//div[2]//div[1]//select[1]");
	
By txt_strength = By.xpath("//input[@id='strength']");

By drp_unit = By.xpath("//div[@class='row']//div[2]//div[2]//div[1]//select[1]");

By txt_instruction = By.xpath("//input[@id='instructions']");

By btn_save = By.xpath("//button[normalize-space()='Save']");

By btn_editDrugs = By.xpath("//tbody/tr[1]/td[5]/a[1]/i[1]");
	
	
// methods 

public void clickSettings() {
	
	driver.findElement(btn_setting).click();
}

public void clickDrugs() {
	
	driver.findElement(btn_drugs).click();
}
	
public void clickaddDrugs() {
	
	driver.findElement(btn_addDrugs).click();
}	
	
public void enterDrugName() {
	
	driver.findElement(txt_drugName).sendKeys(drugName);
}	
	
public void selectDrugType() {
	
Select select = new Select(driver.findElement(drp_drugType));
select.selectByValue("TABLET");

}	
	
public void enterStrength() {
	
	driver.findElement(txt_strength).sendKeys(strength);
}

public void selectUnit() {
	
Select select = new Select(driver.findElement(drp_unit));
select.selectByValue("IU");

}

public void enterInstruction() {
	
	driver.findElement(txt_instruction).sendKeys(instruction);
}

public void clickSave() {
	
	driver.findElement(btn_save).click();
}

public void clickEditDrugs() {
	
	driver.findElement(btn_editDrugs).click();
}

public void enterEditInstruction() {
	
	WebElement editinstruction = driver.findElement(txt_instruction);
	editinstruction.clear();
	editinstruction.sendKeys(instruction1);
}

public void drugs() throws InterruptedException {
	
	clickSettings();
	Thread.sleep(3000);
	clickDrugs();
	Thread.sleep(3000);
	clickaddDrugs();
	Thread.sleep(3000);
	enterDrugName();
	Thread.sleep(3000);
	selectDrugType();
	Thread.sleep(3000);
	enterStrength();
	Thread.sleep(3000);
	selectUnit();
	Thread.sleep(3000);
	enterInstruction();
	Thread.sleep(3000);
	clickSave();
	Thread.sleep(3000);
	clickEditDrugs();
	Thread.sleep(3000);
	enterEditInstruction();
	Thread.sleep(3000);
	clickSave();
	Thread.sleep(3000);
	
	
	
}













}
