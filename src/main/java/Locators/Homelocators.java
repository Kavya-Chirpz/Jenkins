package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;

public class Homelocators {

	
	
	@FindBy(xpath = "//div[@class='navbar navbar-inverse']/following-sibling::div/descendant::h1")
    public WebElement Title;
	


public Homelocators() {
    PageFactory.initElements(Helper.driver, this);
}
}
