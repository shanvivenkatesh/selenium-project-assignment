package com.HotelBooking.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*This class will store all the Locators and methods for the home page*/

public class PaymentPage {

	WebDriver driver;
	By cardNumber = By.xpath("(//input[@class='form-control inputMedium cr_crd_no'])[1]");
	By cardName = By.xpath("(//input[@class='form-control inputMedium cr_crd_name'])[1]");
	By exdate = By.xpath("(//input[@class='form-control inputMedium cr_crd_exp'])[1]");
	By ccv = By.xpath("(//input[@class='gpayformFeildWrap inputMedium marginT5 cr_cvv_no'])[1]");
	By payNow = By.xpath("(//button[@class='button green large citipatBtn btn payNowBtn'])[1]");
	By cardNumberError = By.xpath("(//p[@class='ico13 red padT2 greyDr InvalidError'])[2]");
	By expError = By.xpath("(//p[@class='ico13 red padT2 greyDr InvalidError'])[4]");
	By addressError = By.xpath("//*[@id='card']/div[2]/div/div[4]/div/div/div[1]/div/p/strong");
	
	public PaymentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAddressError() {
		String error = driver.findElement(addressError).getText();
		return error;
	}

	public String getCardNumberError() {
		String error = driver.findElement(cardNumberError).getText();
		return error;
	}
	
	public String getCardexpError() {
		String experror = driver.findElement(expError).getText();
		return experror;
	}
	public void enterCardNumber(String num) {
		
		driver.findElement(cardNumber).sendKeys(num);
	}
	
	public void entercardName(String name) {
	
		driver.findElement(cardName).sendKeys(name);
	}
	
	public void enterexdate(String date) {
		driver.findElement(exdate).sendKeys(date);
	}
	
	public void enterccv(String num) {
		driver.findElement(ccv).sendKeys(num);
	}
	
	
	public void payNow() {
		driver.findElement(payNow).click();
	}
}
