package com.webop.locators;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.webop.common.HelperMethods;

public class Booking_flow_Locators {

	WebDriver driver;
	HelperMethods HelpMethod = new HelperMethods();

	public Booking_flow_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='fullName3']")
	WebElement usernameLocator;

	public void typeUserName(String unam) {
		HelpMethod.waitForElementToBeVisible(usernameLocator);
		usernameLocator.sendKeys(unam);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	WebElement passwordLocator;

	public void typePassword(String pwd) {
		HelpMethod.waitForElementToBeVisible(passwordLocator);
		passwordLocator.sendKeys(pwd);

	}

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement LoginLocatorButton;

	public void clickOnloginButton() {
		HelperMethods.waitForElementToBeClickable(LoginLocatorButton);
		LoginLocatorButton.click();
	}
	
	@FindBy(how = How.XPATH, using = "//footer[@class='shepherd-footer']/button[1]")
	WebElement DemoAlert_Exit;

	public void clickOnDemoAlertExitButton() {
		HelperMethods.waitForElementToBeClickable(DemoAlert_Exit);
		DemoAlert_Exit.click();
	}
	
	

	@FindBy(how = How.ID, using = "clearbutton")
	WebElement clearbutton;

	public void clearButton() {
		HelperMethods.presenceOfElement(clearbutton);
		clearbutton.click();
	}

	
	//@FindBy(how = How.XPATH, using = "//div[@id='jobBookingInputs']/div[2]/div[1]/div[1]/div[1]/igx-input-group/div[1]/div/div/input")
	@FindBy(how = How.XPATH, using = "//*[@id=\"jobBookingInputs\"]/div[2]/div[1]/app-passenger-details/div[2]/div[1]/igx-input-group/div[1]/div/div/input\n")
		
	WebElement Telephonenumber;

	public void typeTelephoneNum(String phone) {
		HelpMethod.waitForElementToBeVisible(Telephonenumber);
		Telephonenumber.click();
		Telephonenumber.sendKeys(phone);
	}

	public void EnterTelephonenum() {
		HelpMethod.waitForElementToBeVisible(Telephonenumber);
		Telephonenumber.sendKeys(Keys.ENTER);
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='dd/MM/y']")
	WebElement Date;

	public void clearDate() {
		HelperMethods.presenceOfElement(Date);
		Date.clear();
	}

	public void typeDate(String date) {
		HelpMethod.waitForElementToBeVisible(Date);
		Date.clear();
		Date.sendKeys(date);
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='HH:mm']")
	WebElement Time;

	public void clickTime() {
		HelperMethods.presenceOfElement(Time);
		Time.click();
	}

	public void typeTime(String time) {
		HelpMethod.waitForElementToBeVisible(Time);
		// Time.clear();
		Time.sendKeys(time);
	}
	

	@FindBy(how = How.XPATH, using = "//div[@id='jobBookingInputs']/div[2]/div[1]/div[3]/div[1]/igx-input-group/div[1]/div/div/input")
	WebElement Name;

	public void typeName(String name) {
		HelpMethod.waitForElementToBeVisible(Name);
		Name.sendKeys(name);
	}

	public void tEnterName() {
		HelpMethod.waitForElementToBeVisible(Name);
		Name.sendKeys(Keys.ENTER);
	}

	
	@FindBy(how = How.XPATH, using = "//div[@id='jobBookingInputs']/div[3]/app-addresses/app-job-address/div[1]/div[1]/igx-input-group/div[1]/div/div/input")
	WebElement PickUpAdress;

	public void typPickAddress(String pickaddress) {
		HelpMethod.waitForElementToBeVisible(PickUpAdress);
		PickUpAdress.sendKeys(pickaddress);
	}

	public void EnterPickAddress() throws InterruptedException {
		HelpMethod.waitForElementToBeVisible(PickUpAdress);
		Thread.sleep(2000);
		PickUpAdress.sendKeys(Keys.ENTER);
	}

	public void EnterPickAddresswithControlkey(String keysNum1) throws InterruptedException {
		HelperMethods.waitForElementToBeVisible(PickUpAdress);
		// Thread.sleep(3000);
		PickUpAdress.sendKeys(Keys.CONTROL + keysNum1);
	}

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	WebElement Pickupdropoffaddressdrp;

	@FindBy(how = How.XPATH, using = "//div[@id='jobBookingInputs']/div[3]/app-addresses/app-job-address/div[3]/div[1]/igx-input-group/div[1]/div/div/input")
	WebElement DropoffAdress;

	public void typDroffAddress(String dropaddress) throws InterruptedException {
		HelpMethod.waitForElementToBeVisible(DropoffAdress);
		// Thread.sleep(2000);
		DropoffAdress.sendKeys(dropaddress);
	}

	public void EnterDropAddresswithControlkey(String keysNum2) throws InterruptedException {
		HelperMethods.waitForElementToBeVisible(DropoffAdress);
		// Thread.sleep(2000);
		DropoffAdress.sendKeys(Keys.CONTROL + keysNum2);
	}

	public void EnterDropAddress() {
		HelpMethod.waitForElementToBeVisible(DropoffAdress);
		DropoffAdress.sendKeys(Keys.ENTER);
	}

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Swap']")
	WebElement Swapbutton;

	public void clickOnSwapButton() {
		HelperMethods.waitForElementToBeClickable(Swapbutton);
		Swapbutton.click();
	}

	@FindBy(how = How.CLASS_NAME, using = "//div[@id='jobBookingInputs']/div[4]/div[2]/igx-select/igx-input-group/div[1]/div/input")
	WebElement PaymentMethod;

	public void clickOnPaymentmethod() {
		HelperMethods.waitForElementToBeClickable(PaymentMethod);
		PaymentMethod.click();
	}

	@FindBy(how = How.ID, using = "passengers")
	WebElement Passengers;

	public void typNumberofPassengers(String passengers) {
		HelpMethod.waitForElementToBeVisible(Passengers);
		Passengers.sendKeys(passengers);
	}

	@FindBy(how = How.ID, using = "vehicles")
	WebElement Vehicles;

	public void typNumberofvehciles(String vehicles) {
		HelpMethod.waitForElementToBeVisible(Vehicles);
		Vehicles.sendKeys(vehicles);
	}

	
	@FindBy(how = How.XPATH, using = "//*[@id='igx-combo-0']/igx-input-group/div[1]/div/div/input")
	WebElement VehiclesType;

	public void clickOnVehciletype() throws InterruptedException {
		HelperMethods.waitForElementToBeClickable(VehiclesType);
		VehiclesType.click();
		Thread.sleep(2000);
	}


	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter a Search Term']")
	WebElement VehicleFeature;
	
	public void clearFeature() {
		HelperMethods.presenceOfElement(VehicleFeature);
		VehicleFeature.clear();
	}
	
	public void clickOnFeature() {
		HelperMethods.waitForElementToBeClickable(VehicleFeature);
		VehicleFeature.click();
	}

	
	public void typvehcilesFeature(String vehfeature) {
		
		HelpMethod.waitForElementToBeVisible(VehicleFeature);
		VehicleFeature.click();
		VehicleFeature.sendKeys(vehfeature);
	}

	
	@FindBy(how = How.XPATH, using = "//*[@id='igx-drop-down-item-9']")
	WebElement SelectFeature;
	
	public void selectVehFeature() throws InterruptedException {
		HelperMethods.waitForElementToBeClickable(SelectFeature);
		SelectFeature.click();
		Thread.sleep(1000);
	}

	
	public void SendEnterButton() {
		HelpMethod.waitForElementToBeVisible(Date);
		Date.sendKeys(Keys.ENTER);
	}
	
	
	@FindBy(how = How.ID, using = "faree")
	WebElement Fares;

	public void CheckFaregreaterthanzero() {
		HelperMethods.waitForElementToBeVisible(Fares);
		String value = Fares.getText();
		System.out.println(value);
		int actualVal = Integer.parseInt(value);
		Assert.assertTrue(actualVal > 0);

	}

	//@FindBy(how = How.XPATH, using = "//*[@id='jobBookingInputs']/div[5]/div[2]/div[3]/igx-input-group/div[1]/div/div/input")

	@FindBy(how = How.XPATH, using = "//*[@id=\"jobBookingInputs\"]/div[5]/div[2]/div[4]/igx-input-group/div[1]/div/div/input")
	
	WebElement AssignDriver;

	public void clickAssignDriverfield() {
		HelperMethods.presenceOfElement(AssignDriver);
		AssignDriver.click();
	}

	public void typDriverName(String driver) {
		HelpMethod.waitForElementToBeVisible(AssignDriver);
		AssignDriver.sendKeys(driver);
	}

	public void EnterDriverkey() {
		HelpMethod.waitForElementToBeVisible(AssignDriver);
		AssignDriver.sendKeys(Keys.ENTER);
	}
}
