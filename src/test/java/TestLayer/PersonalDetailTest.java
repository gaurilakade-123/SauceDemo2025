package TestLayer;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageLayer.PersonalDetailsPage;

public class PersonalDetailTest {
	
	@Parameters({"FirstName","LastName","PinCode"})
	@Test(priority=1)	
	public void AddToCartPage(String FirstName, String LastName, String PinCode) throws InterruptedException
	{
		PersonalDetailsPage personaldetailspage = new PersonalDetailsPage();
		
		personaldetailspage.PersonalDetailsFunctionality(FirstName, LastName, PinCode);
		
		Thread.sleep(3000);
	}
}


  