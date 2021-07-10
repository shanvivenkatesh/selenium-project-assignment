package com.HotelBooking.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*This class will store all the Locators and methods for the home page*/

public class PaymentPage {

	WebDriver driver;
	By cardNumber = By.xpath("//input[@class='form-control inputMedium cr_crd_no payError']");
	By cardName = By.xpath("//*[@id='card']/div[2]/div/div[2]/div[3]/div[2]/div[2]/div/input");
	By exdate = By.xpath("//input[@class='form-control inputMedium cr_crd_exp payError']");
	By ccv = By.xpath("(//input[@class='gpayformFeildWrap inputMedium marginT5 cr_cvv_no'])[1]");
	By payNow = By.xpath("(//button[@class='button green large citipatBtn btn payNowBtn'])[1]");
	
	public PaymentPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void enterCardNumber(String num) {
		driver.findElement(cardNumber).clear();
		driver.findElement(cardNumber).sendKeys(num);
	}
	
	public void entercardName(String name) {
		driver.findElement(cardName).clear();
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
