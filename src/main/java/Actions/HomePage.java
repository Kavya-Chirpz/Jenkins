package Actions;

import org.testng.Assert;

import Locators.Homelocators;
import Utils.Helper;

public class HomePage extends Helper {
	Homelocators locat = new Homelocators();
	public void loginpage()
	{
		driver.get("https://blazedemo.com/index.php");
	}
	public void titlepage()
	{
		String Title = locat.Title.getText();
		Assert.assertEquals(Title, "Welcome to the Simple Travel Agency!");
		System.out.println("Title is verified");
	}
	

}
