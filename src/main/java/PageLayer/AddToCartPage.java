package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class AddToCartPage extends BaseClass {

	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement productSortC;
	
	@FindBys(@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory ']"))
	WebElement addtocart;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement shopingcartL;

	public AddToCartPage()
	{	
		PageFactory.initElements(driver, this);
	}
	
	public void AddToCartPageFunctionality()
	{	
		productSortC.click();
		addtocart.click();
		shopingcartL.click();
	}
		 
		
		
		 

}
