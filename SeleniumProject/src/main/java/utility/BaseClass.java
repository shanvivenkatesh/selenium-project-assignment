package utility;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	

public static void browser(String browserName, String url) {
		
				
		if(browserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		}
		
		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			driver.get(url);
		}}

@AfterTest
public static void closeBrowser() {
	
	//driver.quit();
}

public static void screenCapture() throws IOException {
	File scrFile =( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File screenShotName = new File("C:\\Users\\Varima\\Documents\\GitHub\\selenium-project-assignment\\SeleniumProject\\Screenshots\\"+driver.getTitle()+".png");
FileUtils.copyFile(scrFile, screenShotName);
Reporter.log("<br><img src-'"+screenShotName+"' height='400' width='400/><br>");

}
}


