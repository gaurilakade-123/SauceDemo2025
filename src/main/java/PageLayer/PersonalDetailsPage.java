package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementUtils;

public class PersonalDetailsPage extends BaseClass{
	
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="postalCode")
	WebElement pincode;
	
	@FindBy(name="continue")
	WebElement continuebutton;
	
	@FindBy(xpath="//button[@name='finish']")
	WebElement button;
	
	public PersonalDetailsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void PersonalDetailsFunctionality(String FirstName, String LastName, String PinCode)
	{
		WebElementUtils.sendKeys(firstname, FirstName);
		
		WebElementUtils.sendKeys(lastname, LastName);
		
		WebElementUtils.sendKeys(pincode, PinCode);
		
		WebElementUtils.click(continuebutton);
		
		WebElementUtils.click(button);
	}

}

	
	


