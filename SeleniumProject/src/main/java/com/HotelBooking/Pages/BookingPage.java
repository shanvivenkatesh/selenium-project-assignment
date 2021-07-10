package com.HotelBooking.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*This class will store all the Locators and methods for the home page*/

public class BookingPage {

	WebDriver driver;
	By firstName = By.xpath("(//input[@class='PersonalProfile__NameEnterInput-sc-1r9ak8b-6 hEgRgJ'])[1]");
	By lastName = By.xpath("(//input[@class='PersonalProfile__NameEnterInput-sc-1r9ak8b-6 hEgRgJ'])[2]");
	By emailAddress = By.xpath("//input[@class='PersonalProfile__MobileEnterInput-sc-1r9ak8b-8 fBxMec']");
	By phoneNumber = By.xpath("//input[@class='PersonalProfile__MobileNoWrapper-sc-1r9ak8b-9 jdJlcJ']");
	By paymentOption = By.xpath("//span[@class='GuestDetailsBlockstyles__ButtonSpan-sc-1rzm4ar-7 cpurHQ']");
	
	public BookingPage(WebDriver driver) {
		this.driver = driver;
	}
			
	
	public void enterFirstname(String name) {
		driver.findElement(firstName).sendKeys(name);
	}
	
	public void enterLastname(String name) {
		driver.findElement(lastName).sendKeys(name);
	}
	
	public void enterEmailAddress(String email) {
		driver.findElement(emailAddress).sendKeys(email);
	}
	
	public void enterphoneNumber(String phone) {
		driver.findElement(phoneNumber).sendKeys(phone);
	}
	
	public void clickPaymentOption() {
		driver.findElement(paymentOption).click();
	}
}
