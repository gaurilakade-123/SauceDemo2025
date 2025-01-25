package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginTest {
	
	@Parameters({"browsername"})
	@BeforeTest
	public void setup(String browsername) 
	{
		BaseClass.initialization(browsername);
	}

	
	@Parameters({"username","password"})
	@Test(priority=2)
	public void loginFunctionality(String username, String password) throws InterruptedException
	{
		LoginPage loginpage = new LoginPage();
		
		loginpage.loginFunctionality(username, password);		
		
		Thread.sleep(3000);
	}

}

