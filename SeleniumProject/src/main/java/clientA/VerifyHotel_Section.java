/**
 * 
 */
package clientA;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.HotelBooking.Pages.BookingPage;
import com.HotelBooking.Pages.HomePage;
import com.HotelBooking.Pages.HotelPage;
import com.HotelBooking.Pages.PaymentPage;

import utility.BaseClass;

/**
 * . Search for a hotel and select the first hotel to get the details on the rooms
and rates, location, guest reviews, questions and answers and hotel policies
 *
 */
public class VerifyHotel_Section extends BaseClass{
	@Test
	public void verifyHotelSection() throws InterruptedException, IOException {
	browser("chrome", "https://www.goibibo.com/");
	HomePage homePage = new HomePage(driver);
	HotelPage hotelPage = new HotelPage(driver);
	BookingPage bookingPage = new BookingPage(driver);
	PaymentPage payment = new PaymentPage(driver);
	
	homePage.clickHotel();
	screenCapture();
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
	int totalCount = hotelPage.getTotalHotelCount();
	System.out.println(totalCount);
	Assert.assertEquals(totalCount, 5);
	String hotelName =hotelPage.getTheHotelName();
	hotelPage.selectTheFirstHotel();
	String winHandleBefore = driver.getWindowHandle();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
        System.out.println(driver.getTitle());
        
    }
    String selectedHotelName =hotelPage.getTheSelectedHotelname();
	Assert.assertEquals(hotelName, selectedHotelName);
	hotelPage.selecRoomAndOption();
	screenCapture();
}
}