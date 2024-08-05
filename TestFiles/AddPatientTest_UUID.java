package cliniifyTestNG;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import cliniify.*;
import com.github.javafaker.Faker;
import java.util.UUID;

public class AddPatientTest_UUID extends BaseClass{
	
	AddPatientPage_UUID addPatientPage_UUID;
	
@BeforeMethod
public void initialize() {
	
	addPatientPage_UUID = new AddPatientPage_UUID(driver);
	Faker faker = new Faker();
}
	
@Test
public void addPatientsForm() throws InterruptedException {
	
	for(int i=0; i<=10 ; i++) {
		Thread.sleep(3000);	
addPatientPage_UUID.clickAddPatient();	

// Generate unique patient details using Faker

String uniqueId = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "");

Faker faker = new Faker();
String patientFirstName = faker.name().firstName();
String patientLastName = faker.name().lastName();
String patientEmail = "patient"+ uniqueId.substring(0, 5)+ "@example.com";
String patientPhone = "9"+String.format("%09d", (int)(Math.random()*1000000000));
int patientAge = faker.number().numberBetween(1, 100);
String patientAddress = faker.address().fullAddress();

// Fill in the Add Patient form with unique details
addPatientPage_UUID.enterFirstName(patientFirstName);
addPatientPage_UUID.enterLstName(patientLastName);
addPatientPage_UUID.enterEmail(patientEmail);
addPatientPage_UUID.enterPhone(patientPhone);
addPatientPage_UUID.enterAge(patientAge);
addPatientPage_UUID.selectGender("Female");
addPatientPage_UUID.setAddress(patientAddress);
Thread.sleep(3000);	
addPatientPage_UUID.clickSave();
Thread.sleep(3000);	
		
	}
	
		
}
	
	
	
	
	
	
	
	
	
	
	
	

}
