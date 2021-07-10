package com.HotelBooking.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*This class will store all the Locators and methods for the home page*/

public class HomePage {

	WebDriver driver;
	By hotel = By.partialLinkText("Hotels");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
			
	
	public void clickHotel() {
		driver.findElement(hotel).click();
	}

}
