package TestLayer;

import org.testng.annotations.Test;

import PageLayer.ContainerPage;
import UtilityLayer.WebElementUtils;

public class ContainerTest {
	
	@Test(priority=1)
	public void checkoutFunctionality()  
	{
		ContainerPage containerpage = new ContainerPage();
		containerpage.ContainerFunctionality();
	}

}
