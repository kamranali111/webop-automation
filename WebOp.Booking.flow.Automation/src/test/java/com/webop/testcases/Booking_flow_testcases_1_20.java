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
		
		System.out.println("Priority ============ 1");	
		
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

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		
		//Cancle Demo Alert
		bookingflow.clickOnDemoAlertExitButton();
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

	@Test(priority = 4)
	@Parameters({ "Teleno4", "KeybaordKeys1", "KeybaordKeys2", "Date", "Time1", "Time2", "AssignDrvr", "F1" })
	public void Booked_Job_2(String Teleno4, String KeybaordKeys1, String KeybaordKeys2, String Date, String Time1,
			String Time2, String AssignDrvr, String F1) throws InterruptedException {

		System.out.println("Priority== 4");

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno4);
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

	@Test(priority = 5)
	@Parameters({ "Teleno2", "KeybaordKeys2", "KeybaordKeys3", "Date", "Time1", "Time2", "AssignDrvr", "F2" })
	public void Booked_Job_3(String Teleno2, String KeybaordKeys2, String KeybaordKeys3, String Date, String Time1,
			String Time2, String AssignDrvr, String F2) throws InterruptedException {

		System.out.println("Priority== 5");

		
		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno2);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys2);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys3);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F2);
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

	@Test(priority = 6)
	@Parameters({ "Teleno3", "KeybaordKeys2", "KeybaordKeys1", "Date", "Time1", "Time2", "AssignDrvr", "F3" })
	public void Booked_Job_4(String Teleno3, String KeybaordKeys2, String KeybaordKeys1, String Date, String Time1,
			String Time2, String AssignDrvr, String F3) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno3);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys2);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys1);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F3);
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

	@Test(priority = 7)
	@Parameters({ "Teleno5", "KeybaordKeys3", "KeybaordKeys2", "Date", "Time1", "Time2", "AssignDrvr", "F4", "F1", "F2", "F3", "F5"})
	public void Booked_Job_5(String Teleno5, String KeybaordKeys3, String KeybaordKeys2, String Date, String Time1,
			String Time2, String AssignDrvr, String F4, String F1, String F2, String F3, String F5) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno5);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys3);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys2);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F4);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(2000);
		
		bookingflow.typvehcilesFeature(F1);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		bookingflow.typvehcilesFeature(F2);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		bookingflow.typvehcilesFeature(F3);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(2000);
		
		bookingflow.typvehcilesFeature(F5);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		
		bookingflow.SendEnterButton();
		Thread.sleep(2000);

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

	@Test(priority = 8)
	@Parameters({ "Teleno6", "KeybaordKeys4", "KeybaordKeys5", "Date", "Time1", "Time2", "AssignDrvr", "F1", "F2","F3" })
	public void Booked_Job_6(String Teleno6, String KeybaordKeys4, String KeybaordKeys5, String Date, String Time1,
			String Time2, String AssignDrvr, String F1, String F2, String F3) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno6);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys4);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys5);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F1);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		bookingflow.typvehcilesFeature(F2);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		bookingflow.typvehcilesFeature(F3);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(2000);
		

		
		bookingflow.SendEnterButton();
		Thread.sleep(2000);

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

	@Test(priority = 9)
	@Parameters({ "Teleno7", "KeybaordKeys1", "KeybaordKeys2", "Date", "Time1", "Time2", "AssignDrvr", "F6", "F7", "F8"})
	public void Booked_Job_7(String Teleno7, String KeybaordKeys1, String KeybaordKeys2, String Date, String Time1,
			String Time2, String AssignDrvr, String F6, String F7, String F8) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno7);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys1);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys2);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F6);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		bookingflow.typvehcilesFeature(F7);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		bookingflow.typvehcilesFeature(F8);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(2000);
		

		
		bookingflow.SendEnterButton();
		Thread.sleep(2000);
	

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

	@Test(priority = 10)
	@Parameters({ "Teleno8", "KeybaordKeys3", "KeybaordKeys2", "Date", "Time1", "Time2", "AssignDrvr", "F9", "F10", "F11"})
	public void Booked_Job_8(String Teleno8, String KeybaordKeys3, String KeybaordKeys2, String Date, String Time1,
			String Time2, String AssignDrvr, String F9, String F10, String F11) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno8);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys3);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys2);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F9);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		bookingflow.typvehcilesFeature(F10);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		bookingflow.typvehcilesFeature(F11);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(2000);
		

		
		bookingflow.SendEnterButton();
		Thread.sleep(2000);

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

	@Test(priority = 11)
	@Parameters({ "Teleno9", "KeybaordKeys3", "KeybaordKeys1", "Date", "Time1", "Time2", "AssignDrvr", "F1", "F2" })
	public void Booked_Job_9(String Teleno9, String KeybaordKeys3, String KeybaordKeys1, String Date, String Time1,
			String Time2, String AssignDrvr, String F1, String F2) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno9);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys3);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys1);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F1);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		bookingflow.typvehcilesFeature(F2);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		bookingflow.SendEnterButton();
		Thread.sleep(2000);

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

	@Test(priority = 12)
	@Parameters({ "Teleno10", "KeybaordKeys3", "KeybaordKeys4", "Date", "Time1", "Time2", "AssignDrvr", "F3", "F1" })
	public void Booked_Job_10(String Teleno10, String KeybaordKeys3, String KeybaordKeys4, String Date, String Time1,
			String Time2, String AssignDrvr, String F3, String F1) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno10);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys3);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys4);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F3);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		
		bookingflow.typvehcilesFeature(F1);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(2000);
		
		bookingflow.SendEnterButton();
		Thread.sleep(2000);


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

	@Test(priority = 13)
	@Parameters({ "Teleno11", "KeybaordKeys4", "KeybaordKeys5", "Date", "Time1", "Time2", "AssignDrvr", "F1", "F4" })
	public void Booked_Job_11(String Teleno11, String KeybaordKeys4, String KeybaordKeys5, String Date, String Time1,
			String Time2, String AssignDrvr, String F1, String F4) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno11);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys4);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys5);
	    Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F1);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		
		bookingflow.typvehcilesFeature(F4);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(2000);
		
		bookingflow.SendEnterButton();
		Thread.sleep(2000);



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

	@Test(priority = 14)
	@Parameters({ "Teleno1", "KeybaordKeys4", "KeybaordKeys5", "Date", "Time1", "Time2", "AssignDrvr", "F1", "F5" })
	public void Booked_Job_12(String Teleno1, String KeybaordKeys4, String KeybaordKeys5, String Date, String Time1,
			String Time2, String AssignDrvr, String F1, String F5) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno1);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys4);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys5);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F1);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(1000);
		
		
		bookingflow.typvehcilesFeature(F5);
		bookingflow.selectVehFeature();
		bookingflow.clickOnFeature();
		bookingflow.clearFeature();
		Thread.sleep(2000);
		
		bookingflow.SendEnterButton();
		Thread.sleep(2000);

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

	@Test(priority = 15)
	@Parameters({ "Teleno1", "KeybaordKeys3", "KeybaordKeys2", "Date", "Time1", "Time2", "AssignDrvr", "F1" })
	public void Booked_Job_13(String Teleno1, String KeybaordKeys3, String KeybaordKeys2, String Date, String Time1,
			String Time2, String AssignDrvr, String F1) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno1);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys3);
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

	@Test(priority = 16)
	@Parameters({ "Teleno1", "KeybaordKeys1", "KeybaordKeys2", "Date", "Time1", "Time2", "AssignDrvr", "F2"})
	public void Booked_Job_14(String Teleno1, String KeybaordKeys1, String KeybaordKeys2, String Date, String Time1,
			String Time2, String AssignDrvr, String F2) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
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
		bookingflow.typvehcilesFeature(F2);
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

	@Test(priority = 17)
	@Parameters({ "Teleno2", "KeybaordKeys1", "KeybaordKeys2", "Date", "Time1", "Time2", "AssignDrvr", "F3" })
	public void Booked_Job_15(String Teleno2, String KeybaordKeys1, String KeybaordKeys2, String Date, String Time1,
			String Time2, String AssignDrvr, String F3) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno2);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys1);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys2);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F3);
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

	@Test(priority = 18)
	@Parameters({ "Teleno2", "KeybaordKeys3", "KeybaordKeys5", "Date", "Time1", "Time2", "AssignDrvr", "F4" })
	public void Booked_Job_16(String Teleno2, String KeybaordKeys3, String KeybaordKeys5, String Date, String Time1,
			String Time2, String AssignDrvr, String F4) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno2);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys3);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys5);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F4);
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

	@Test(priority = 19)
	@Parameters({ "Teleno2", "KeybaordKeys1", "KeybaordKeys5", "Date", "Time1", "Time2", "AssignDrvr", "F5" })
	public void Booked_Job_17(String Teleno2, String KeybaordKeys1, String KeybaordKeys5, String Date, String Time1,
			String Time2, String AssignDrvr, String F5) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno2);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys1);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys5);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F5);
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

	@Test(priority = 20)
	@Parameters({ "Teleno3", "KeybaordKeys1", "KeybaordKeys5", "Date", "Time1", "Time2", "AssignDrvr", "F6" })
	public void Booked_Job_18(String Teleno3, String KeybaordKeys1, String KeybaordKeys5, String Date, String Time1,
			String Time2, String AssignDrvr, String F6) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno3);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys1);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys5);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F6);
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

	@Test(priority = 21)
	@Parameters({ "Teleno3", "KeybaordKeys2", "KeybaordKeys3", "Date", "Time1", "Time2", "AssignDrvr", "F7" })
	public void Booked_Job_19(String Teleno3, String KeybaordKeys2, String KeybaordKeys3, String Date, String Time1,
			String Time2, String AssignDrvr, String F7) throws InterruptedException {

		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno3);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys2);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys3);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F7);
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

	@Test(priority = 22)
	@Parameters({ "Teleno4", "KeybaordKeys2", "KeybaordKeys3", "Date", "Time1", "Time2", "AssignDrvr", "F8" })
	public void Booked_Job_20(String Teleno4, String KeybaordKeys2, String KeybaordKeys3, String Date, String Time1,
			String Time2, String AssignDrvr, String F8) throws InterruptedException {

		System.out.println("Priority ===== 22 final one.");
		
		bookingflow = new Booking_flow_Locators(driver);
		HelperMethods.waitForPageLoaded();
		bookingflow.clearButton();
		Thread.sleep(2000);

		// Phone Number and Address, Cartype, vehicle quality, and Jobtype
		bookingflow.typeTelephoneNum(Teleno4);
		bookingflow.EnterTelephonenum();
		Thread.sleep(2000);
		bookingflow.EnterPickAddresswithControlkey(KeybaordKeys2);
		Thread.sleep(2000);
		bookingflow.EnterDropAddresswithControlkey(KeybaordKeys3);
		Thread.sleep(2000);
		
		bookingflow.clickOnVehciletype();
		bookingflow.typvehcilesFeature(F8);
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
