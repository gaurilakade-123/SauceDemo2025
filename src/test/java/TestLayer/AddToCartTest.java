package TestLayer;

import org.testng.annotations.Test;

import PageLayer.AddToCartPage;

public class AddToCartTest {
	
	@Test(priority=1)	
	public void AddToCartPage() throws InterruptedException  
	{
		AddToCartPage addtocartpage = new AddToCartPage();
		
		addtocartpage.AddToCartPageFunctionality();	
		
		Thread.sleep(3000);
	}


}
 
