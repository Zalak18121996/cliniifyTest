package cliniify;

import org.openqa.selenium.*;


public class Settings_CommonIssuesPage {

	WebDriver driver;

	String issue = "Teeth";
	
	String editIssue = "Impacted Teeth";
	
	public Settings_CommonIssuesPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
// locators 
	
	By btn_setting = By.xpath("//i[@class='bx bx-cog icons-font']");
	
	By btn_comnIssue = By.xpath("//a[normalize-space()='Common Issues']");
	
	By txt_issueName = By.xpath("//input[@placeholder='Enter Issue Name']");
	
	By btn_save = By.xpath("//button[normalize-space()='Save']");
	
	By btn_editComnIssue = By.xpath("(//td[contains(text(),'abcd')]/following-sibling::td/button/i)[1]");
	
	By txt_editComnIssue = By.xpath("//input[@class='form-control']");
	
	By btn_saveEditComnIssue = By.xpath("//button[@class='btn btn-success mr-3']");
	
	//methods
	
	public void clickSettings() {
		
		driver.findElement(btn_setting).click();
	}
	
public void clickCommonIssues() {
		
		driver.findElement(btn_comnIssue).click();
	}	
	
public void enterIssueName() {
	
	driver.findElement(txt_issueName).sendKeys(issue);
}		
	
public void clickSave() {
	
	driver.findElement(btn_save).click();
}	
	
public void clickEditComnIssue() {
	
	driver.findElement(btn_editComnIssue).click();
}		
	
public void enterEditComnIssue() {
	
	WebElement issueName = driver.findElement(txt_editComnIssue);
	issueName.clear();
	issueName.sendKeys(editIssue);
}	
	
public void clickEditComnIssueSave() {
	
	driver.findElement(btn_saveEditComnIssue).click();
}


}
