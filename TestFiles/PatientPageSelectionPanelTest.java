package cliniifyTestNG;


import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cliniify.*;

public class PatientPageSelectionPanelTest {
	
	WebDriver driver;
	LoginPage loginPage;
	PatientPage patientPage;
	PatientPageSidePanel patientPageSidePanel;
	
	  @BeforeClass
	  public void beforeClass() {
		  
			 driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 driver.get("https://app.cliniify.com/#/login");	
			 driver.manage().window().maximize();
			 
			 // Initialize page objects
			 loginPage = new LoginPage(driver);
			 patientPage = new PatientPage(driver);
			 patientPageSidePanel = new PatientPageSidePanel(driver);
			 
	  }
	  
	  
  @Test
  public void patientSelectionPanel() throws InterruptedException {
	  
	 loginPage.login(); 
	 patientPage.clickPatient();
	 patientPageSidePanel.patientPageSidePannel();
	  	  
  }


  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }

}
