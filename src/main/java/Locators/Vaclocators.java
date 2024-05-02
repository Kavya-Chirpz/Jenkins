package Locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;

public class Vaclocators {

	
	
	@FindBy(xpath = "//a[@href ='vacation.html']")
    public WebElement vaclink;
	@FindBy(xpath = "//select[@name='fromPort']")
    public WebElement fromcountry;
	@FindBy(xpath = "//select[@name='toPort']")
    public WebElement tocountry;
	@FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;
	@FindBy(xpath = "//table/tbody/td")
    public List<WebElement>	 rows;
	
	


public Vaclocators() {
    PageFactory.initElements(Helper.driver, this);
}
}
