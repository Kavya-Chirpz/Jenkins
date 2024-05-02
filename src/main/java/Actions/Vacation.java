package Actions;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Locators.Homelocators;
import Locators.Vaclocators;
import Utils.Helper;

	
public class Vacation extends Helper {
	Vaclocators locat = new Vaclocators();
	public void vacpage()
	{
		locat.vaclink.click();
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("vacation"));
		driver.navigate().back();
	}
	public void dropdown(String from , String To)
	{
		Select s = new Select(locat.fromcountry);
		s.selectByVisibleText(from);
		s = new Select(locat.tocountry);
		s.selectByVisibleText(To);
		locat.submit.click();
		
	}
	public void chooseflight()
	{
		int count = locat.rows.size();
		System.out.println(count);
		String path = "//table/tbody/tr/td["+count+"]";
		List<WebElement> price =driver.findElements(By.xpath(path));
		List<Integer> pri = new LinkedList<Integer>();
		for(int i=0;i<count;i++)
		{
			String k = price.get(i).getText();
			pri.add(Integer.parseInt(k));
		
		}
		System.out.println(pri);
			
	}
}
