package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Pages.HomePage;
import Pages.RegisterPage;

public class RegisterPageTest extends Testbase {
	
	
	HomePage hp;
	RegisterPage rp;
	@BeforeMethod
	public void setup() throws Exception
	{
	
		initialization();
		 hp=new HomePage();
		 rp =new RegisterPage();
	}
	
	@Test (enabled = false)
	public void fillFromTest() throws Exception {
	
		
		hp.registerButton();
		rp.fillFrom();
		
	}
	
	@Test (enabled = false)
	public void verifyTitle()
	{
			hp.registerButton();
		 String title = rp.verifyTitle();
		Assert.assertEquals(title, "nopCommerce demo store. Register");
	}
	
	@Test (enabled = false)
	public void successfulRegTest() throws Exception
	{
		hp.registerButton();
		rp.fillFrom();
		String text = rp.successfulReg();
		Assert.assertEquals(text, "Register");
	}
	@Test(enabled = false)
	public void successfulRegText() throws Exception
	{
		hp.registerButton();
		rp.fillFrom();
		String text1 = rp.successfulRegText();
		Assert.assertEquals(text1, "Your registration completed");
	}
	
	@Test
	public void continueBtnTest() throws Exception 
	{
		hp.registerButton();
		rp.fillFrom();
		rp.continueBtn();
		
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}
