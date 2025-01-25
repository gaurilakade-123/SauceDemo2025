package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementUtils;

    public class LoginPage extends BaseClass
    {
    	@FindBy(name = "user-name")
    	WebElement UserName;
    	
    	@FindBy(name = "password")
    	WebElement PassWord;
    	
    	@FindBy(name = "login-button")
    	WebElement Loginbutton;	
    	
     public LoginPage()
     {
    	 PageFactory.initElements(driver, this);
     }

     public void loginFunctionality(String username, String password)
     {
    	 WebElementUtils.sendKeys(UserName, username);
    	 
    	 WebElementUtils.sendKeys(PassWord, password);
    	 
    	 WebElementUtils.click(Loginbutton);
    	 
     }

}
    
    
    	 
    	
  
 

 
	

