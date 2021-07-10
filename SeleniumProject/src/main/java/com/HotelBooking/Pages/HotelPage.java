package com.HotelBooking.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*This class will store all the Locators and methods for the home page*/

public class HotelPage {

	WebDriver driver;
	By location = By.id("downshift-1-input");
	By dropdown = By.id("downshift-1-menu");
	By checkIn = By.cssSelector("div:nth-child(3) > div >div:nth-child(1) > div:nth-child(1) > div");
	By dateArrow = By.xpath("(//div[@class='dcalendarstyles__SliderArrow-sc-r2jz2t-14 ipNVzX'])[2]");
	By selectCheckInDate = By.cssSelector("li:nth-child(13) > span");
	By selectCheckOutDate = By.cssSelector("li:nth-child(17) > span");
	By guestRoom = By.xpath("//div[@class='SearchBlockUIstyles__PaxCountWrap-sc-fity7j-9 heYAZX']");
	By SelectNoOfAdult = By.cssSelector("div > div > div:nth-child(2) > div > span:nth-child(1)");
	By clickDone = By.cssSelector(" .PaxWidgetstyles__ButtonWrapperDiv-sc-gv3w6r-10.bVzuTd button");
	By searchHotel = By.cssSelector("div.SearchBlockUIstyles__AutoSuggestOuterWrap-sc-fity7j-0.ecbwUo button");
	By ListOFHotelsName= By.xpath("//div[@class='HotelCardstyles__HotelNameWrapperDiv-sc-1s80tyk-12 biniNQ']");
	By selectTheHotel = By.xpath("(//h4[@class='dwebCommonstyles__SmallSectionHeader-sc-112ty3f-7 hAEfdZ'])[1]");
	By getTheSelectedHotelName = By.cssSelector("div:nth-child(2) h1");
	By selectRoom = By.xpath("(//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-10 RoomFlavorstyles__ButtonWrapper-sc-1btnl3r-15 KETBj bIgcAI'])[1]");

	
	public HotelPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void selectRoom() {
		driver.findElement(selectRoom).click();
	}
	public List<WebElement> getHotelNames() {
		
		List<WebElement> hotelNames =driver.findElements(ListOFHotelsName);
		for(WebElement hotelname : hotelNames){
			System.out.println(hotelname.getText());
		}
		return hotelNames;
	}
	
public int getTotalHotelCount() {
		
		List<WebElement> hotelCounts =driver.findElements(ListOFHotelsName);
		int count =hotelCounts.size();
		return count;
		
	}
	
	public void enterLocation(String locationname) {
		driver.findElement(location).sendKeys(locationname);
	}
	
	public void selectTheLocation() throws InterruptedException {
		
				java.util.List<WebElement> element = driver.findElements(dropdown);
		element.get(0).click();
	}
	
	public void clickCheckIn() {
		driver.findElement(checkIn).click();
	}
	
	public void clickNextMonth() {
		driver.findElement(dateArrow).click();
	}
	
	public void selectCheckInTheDate() {
		driver.findElement(selectCheckInDate).click();
	}
	
	public void selectTheCheckOutDate() {
		driver.findElement(selectCheckOutDate).click();
	}
	
	public void selectGuestRoom() {
		driver.findElement(guestRoom).click();
	}
	
	public void selectOneAdult() {
		 driver.findElement(SelectNoOfAdult).click();
	}
	
	public void clickDoneButton() {
		driver.findElement(clickDone).click();
	}
	
	public void clickSearchHotel() {
		driver.findElement(searchHotel).click();
	}
	
	public String getTheHotelName() {
		String hotelname =driver.findElement(selectTheHotel).getText();
				return hotelname;
	}
	
	public void selectTheFirstHotel() {
			driver.findElement(selectTheHotel).click();
		}
	
	public String getTheSelectedHotelname() {
		String getTheselectedHotelName = driver.findElement(getTheSelectedHotelName).getText();
		return getTheselectedHotelName;
	}
	
	public void searchHotel(String locatioNname) throws InterruptedException {
		enterLocation(locatioNname);
		selectTheLocation();
		clickCheckIn();
		clickNextMonth();
		selectCheckInTheDate();
		selectTheCheckOutDate();
		selectGuestRoom();
		selectOneAdult();
		clickDoneButton();
		clickSearchHotel();
		
	}
}
