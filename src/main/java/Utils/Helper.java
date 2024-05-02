package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import io.cucumber.java.Before;


public class Helper {
	public static WebDriver driver;
	
	
	public static void setupdriver()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\driver\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void quitdriver()
	{
		if(driver!= null) {
			driver.quit();
			driver= null;
		}
	}

}
