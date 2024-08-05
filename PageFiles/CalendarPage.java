package cliniify;

import java.util.List;

import org.openqa.selenium.*;

public class CalendarPage {

WebDriver driver;	

public CalendarPage(WebDriver driver) {
	
	this.driver = driver;
}
	
//Locators

By btn_caldr = By.xpath("//i[@class='bx bx-calendar icons-font']");

By btn_datepicker = By.xpath("//input[@aria-label='Datepicker input']");
	
By curnt_month = By.xpath("//button[@aria-label='Open months overlay']");

By curnt_year = By.xpath("//button[@aria-label='Open years overlay']");

By btn_next = By.xpath("//button[@aria-label='Next month']//span[@class='dp__inner_nav']//*[name()='svg']");

By all_date = By.xpath("//div[ @class='dp__calendar_item']");

By btn_month = By.xpath("//button[normalize-space()='month']");

By btn_week = By.xpath("//button[normalize-space()='week']");

By btn_day = By.xpath("//button[normalize-space()='day']");

By btn_docunavail = By.xpath("//a[normalize-space()='Doctor Unavailability']");
	
//Methods

public void clickCalender() {
	
	driver.findElement(btn_caldr).click();
}

public void clickDatePicker() {
	
	driver.findElement(btn_datepicker).click();
}

public void selectFutureDate(WebDriver driver, String date, String month, String year) {
	
	while(true) {
		
		String curntMonth = driver.findElement(curnt_month).getText();
		
		String curntYear = driver.findElement(curnt_year).getText();
		
		if(curntMonth.equals(month) && curntYear.equals(year)) {
			break;
		}
	driver.findElement(btn_next).click(); // click on next button
				
	}
	List<WebElement>allDates = driver.findElements(all_date);	
	
	for(WebElement dt: allDates) 
	{
		if(dt.getText().equals(date)) 
		{
			dt.click();
			break;
		}
	}
}

public void clickMonth() {
	
	driver.findElement(btn_month).click();
}

public void clickWeek() {
	
	driver.findElement(btn_week).click();
}

public void clickDay() {
	
	driver.findElement(btn_day).click();
}

public void clickDocUnavail() {
	
	driver.findElement(btn_docunavail).click();
}





	
}
