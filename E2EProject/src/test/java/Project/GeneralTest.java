package Project;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class GeneralTest extends Base{

	@Test
	public void BasePageNavigation() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://www.n11.com/");
	}
	
	@Test
	public void testLogin()
	{
		LoginPage lop = new LoginPage(driver);
		LandingPage lap = new LandingPage(driver);
		
		lop = lap.SingIn();
		lop.login("-------", "-------");
		lap = lop.ClickLogin();
		
	}

}
