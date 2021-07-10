/**
 * 
 */
package booking_hotel;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.HotelBooking.Pages.BookingPage;
import com.HotelBooking.Pages.HomePage;
import com.HotelBooking.Pages.HotelPage;
import com.HotelBooking.Pages.PaymentPage;

import net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.AccessBridgeWrapper;
import utility.BaseClass;

/**
 * 2. Book for a hotel stay for one adult in Ooty, wherein the stay should be more
than a day. Fill in dummy card details while making the payment and
observe the error message
 *
 */
public class Book_Hotel extends BaseClass{
	@Test
	public void bookHotel() throws InterruptedException {
		
					
			browser("chrome", "https://www.goibibo.com/");
			HomePage homePage = new HomePage(driver);
			HotelPage hotelPage = new HotelPage(driver);
			BookingPage bookingPage = new BookingPage(driver);
			PaymentPage payment = new PaymentPage(driver);
			
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
			int totalCount = hotelPage.getTotalHotelCount();
			System.out.println(totalCount);
			Assert.assertEquals(totalCount, 5);
			String hotelName =hotelPage.getTheHotelName();
			System.out.println(hotelName);
			hotelPage.selectTheFirstHotel();
			String winHandleBefore = driver.getWindowHandle();
	        for(String winHandle : driver.getWindowHandles()){
	            driver.switchTo().window(winHandle);
	            System.out.println(driver.getTitle());
	            
	        }
	        String selectedHotelName =hotelPage.getTheSelectedHotelname();
        	Assert.assertEquals(hotelName, selectedHotelName);
        	hotelPage.selectRoom();
        	bookingPage.enterFirstname("Malar");
        	bookingPage.enterLastname("Charu");
        	bookingPage.enterEmailAddress("malar.charu@gmail.com");
        	bookingPage.enterphoneNumber("9551386405");
        	bookingPage.clickPaymentOption();
        	payment.enterCardNumber("123454545454");
        	payment.entercardName("MalarCharu");
        	payment.enterexdate("2207");
        	payment.enterccv("123");
        	payment.payNow();
			
        	//driver.switchTo().window(winHandleBefore);
			
	}

	
}
