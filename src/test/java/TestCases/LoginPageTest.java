package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;

public class LoginPageTest extends Testbase {
	
	HomePage hp;
	RegisterPage rp;
	LoginPage lp;
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		  hp = new HomePage();
		  rp =new RegisterPage();
		  lp = new LoginPage();
		  
	}
	
	
	@Test (enabled = true)
	public void LoginToAppTest()
	{
		hp.welcomeHome();
		String text = lp.LoginToApp();
		Assert.assertEquals(text , "Welcome, Please Sign In!");
	}
	@Test (enabled = true)
	public void fillLoginformTest()
	{
		lp.LoginToApp();
		lp.fillLoginForm();
	}
	@Test (enabled = true)
	public void getCurrentUrlTest()
	{
		lp.LoginToApp();
		String url = lp.getCurrentUrl();
		Assert.assertEquals(url, "https://demo.nopcommerce.com/login?returnUrl=%2F");
	}
	
	@Test(enabled = true)
	public void regButtnTest() throws Exception
	{
		lp.LoginToApp();
		lp.fillLoginForm();
		lp.regButtn();
		rp.fillFrom();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	

}
