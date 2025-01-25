package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class ContainerPage extends BaseClass{
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	
	public ContainerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ContainerFunctionality()
	{
		checkout.click();	
	}

}
