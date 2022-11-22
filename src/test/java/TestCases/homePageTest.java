package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Pages.HomePage;

public class homePageTest extends Testbase {

	
	HomePage hp;
	
	@BeforeMethod (alwaysRun=true)
	public void setUp() throws Exception
	{
		initialization();
		hp=new HomePage();
	
	}
	@Test (groups="sanity")
	public void verifyLogoTest()
	{
		boolean nopLogo = hp.verifyLogo();
		Assert.assertEquals(nopLogo, true);
	}
	
	@Test(groups="regression")
	public void titleOfPageTest()
	{
		hp.titleOfPage();
	}
	
	@Test (groups="sanity")
	public void registerButtonTest()
	{
		hp.registerButton();
		String curntUrl = hp.registerButton();
		Assert.assertEquals(curntUrl, "https://demo.nopcommerce.com/register?returnUrl=%2F");
	}
	@Test(groups="retest")
	public void welcomeHomeTest()
	{
		String title = hp.welcomeHome();
		Assert.assertEquals(title, "Welcome to our store");
		
	}
	
	@AfterMethod (alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}
