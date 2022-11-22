package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;

public class HomePage extends Testbase {
	
	//object Repository
	@FindBy(xpath="//img[@alt='nopCommerce demo store']") private WebElement nopCom;
	@FindBy(xpath="//a[text()='Register']")private WebElement regBtn;
	@FindBy(xpath="//h2[text()='Welcome to our store']")private WebElement welcomText;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public  boolean verifyLogo()
	{
		return nopCom.isDisplayed();
	}
	
	public String titleOfPage()
	{
		return driver.getTitle();
	}
	
	public  String welcomeHome()
	{
		return welcomText.getText();
	}
	public String registerButton()
	{
		regBtn.click();
		return  driver.getCurrentUrl();
	}
	

}
