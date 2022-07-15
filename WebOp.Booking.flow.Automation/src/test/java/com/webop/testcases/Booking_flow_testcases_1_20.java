package com.webop.testcases;

import com.webop.common.HelperMethods;
import com.webop.locators.Booking_flow_Locators;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.webop.common.BrowsersFactory;

public class Booking_flow_testcases_1_20 extends BrowsersFactory {

	Booking_flow_Locators bookingflow;
	HelperMethods HelpMethod = new HelperMethods();

	@Test(priority = 1)
	@Parameters("URL")
	public void Emerald_Lunched(String URL) {
		
		System.out.println("Test Case ============ 1");	
		
		driver.get(URL);
		try {
			HelperMethods.waitForPageLoaded();
			String VisitedUrl = driver.getCurrentUrl();
			Assert.assertEquals(URL, VisitedUrl);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	@Parameters({ "ValidUsername", "ValidPassword" })
	public void valid_login(String ValidUsername, String ValidPassword) {
		
		System.out.println("Test Case ============ 2");	
		
		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.typeUserName(ValidUsername);
		bookingflow.typePassword(ValidPassword);
		bookingflow.clickOnloginButton();
		System.out.println("UserA");

	}

	@Test(priority = 3)
	@Parameters({ "Teleno1", "KeybaordKeys1", "KeybaordKeys2", "Date", "Time1", "Time2", "AssignDrvr", "F1" })
	public void Booked_Job_with_Normal_flow_1(String Teleno1, String KeybaordKeys1, String KeybaordKeys2, String Date,
			String Time1, String Time2, String AssignDrvr, String F1) throws InterruptedException {
		
		System.out.println("Test Case ============ 3");	

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		
		
		//Cancle Demo Alert
	//	bookingflow.clickOnDemoAlertExitButton();
		
		Thread.sleep(2000);
		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno1);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys1);
		
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys2);
		Thread.sleep(2000);
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F1);
		bookingflow.selectVehFeature();	
		Thread.sleep(2000);
		bookingflow.SendEnterButton();
	
		

		// Time Range Creation
		int a = Integer.parseInt(Time1);
		int b = Integer.parseInt(Time2);
		int Timerange = ThreadLocalRandom.current().nextInt(a, b);
		String StringTime = Integer.toString(Timerange);

 
		// Date and Time
		bookingflow.clearDate();
		System.out.println(Date);
		bookingflow.typeDate(Date);
		bookingflow.clickTime();
		System.out.println(StringTime);
		Thread.sleep(3000);
		bookingflow.typeTime(StringTime);

		// Assigning Drivers
		Thread.sleep(4000);
		
		
		bookingflow.typDriverName(AssignDrvr);
		
		Thread.sleep(1000);
		bookingflow.EnterDriverkey();
		Thread.sleep(2000);
		

	}

	
}
