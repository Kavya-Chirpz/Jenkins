package RunnerTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Utils.Helper;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Logintest", features = "src/test/resources/Login.feature", glue = "stepdef",monochrome = true)
 
public class RunnerTest extends AbstractTestNGCucumberTests {
	@Parameters("Browser")
	@BeforeMethod
	public void drivers(String browsername)
	{
		System.out.println("The browser name is"+browsername);
		if(browsername.contains("Chrome"))
		{
			System.out.println("Hey we are inside Chrome");
		}
		else if(browsername.contains("Edge"))
		{
			System.out.println("Hey we are inside Edge");
		}
		Helper.setupdriver();
		
	}
	@AfterMethod
	public void quit()
	{
		Helper.quitdriver();
	}
}


