package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import Pages.productListing;

public class productListingTest extends Testbase {
	
	HomePage hp;
	RegisterPage rp;
	LoginPage lp;
	productListing pl;
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		 hp = new HomePage();
		  rp =new RegisterPage();
		  lp = new LoginPage();
		 pl=new productListing(); 
	}
	
	@Test (enabled = false)
	public void addProductTest() throws Exception
	{
		
		pl.addProduct();
		lp.regButtn();
		rp.fillFrom();
		rp.continueBtn();
		pl.shippingprod();	
		pl.checkoutPage();
		pl.shippingMethod();
	}
	
	@Test(enabled = true)
	public void successfullyDoneTest() throws Exception
	{
		pl.addProduct();
		lp.regButtn();
		rp.fillFrom();
		rp.continueBtn();
		pl.shippingprod();	
		pl.checkoutPage();
		pl.shippingMethod();
		String text = pl.successfullyDone();
		Assert.assertEquals(text, "Thank you");
		System.out.println(text);
		String text1 = pl.successfullyDone2();
		Assert.assertEquals(text1, "Your order has been successfully processed!");
		System.out.println(text1);
	}
	

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
