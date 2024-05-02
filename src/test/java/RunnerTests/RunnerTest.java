package RunnerTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.Helper;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Logintest", features = "src/test/resources/Login.feature", glue = "stepdef",monochrome = true)
 
public class RunnerTest extends AbstractTestNGCucumberTests {
	@BeforeMethod
	public void drivers()
	{
		Helper.setupdriver();
	}
	@AfterMethod
	public void quit()
	{
		Helper.quitdriver();
	}
}


