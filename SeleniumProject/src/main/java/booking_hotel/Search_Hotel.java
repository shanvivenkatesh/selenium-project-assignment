/**
 * 
 */
package booking_hotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.HotelBooking.Pages.HomePage;
import com.HotelBooking.Pages.HotelPage;

import utility.BaseClass;

/**
 * @author Varima
 *Search a hotel for one adult and log the hotel's name in TestNG
 */
public class Search_Hotel extends BaseClass{
	
	
	@Test
public void searchHotel() throws InterruptedException {
		
	HomePage homePage = new HomePage(driver);
	HotelPage hotelPage = new HotelPage(driver);			
		browser("chrome", "https://www.goibibo.com/");	
		homePage.clickHotel();
		hotelPage.enterLocation("OOty");
		hotelPage.selectTheLocation();
		hotelPage.clickCheckIn();     
		hotelPage.clickNextMonth();
		hotelPage.selectCheckInTheDate();
		hotelPage.selectTheCheckOutDate();
		hotelPage.selectGuestRoom();
		hotelPage.selectOneAdult();
		hotelPage.clickDoneButton();
		hotelPage.clickSearchHotel();
		hotelPage.getHotelNames();

}
}
