package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;

public class LoginPage extends Testbase {
	
	//object Repository
	@FindBy(xpath="//a[text()='Log in']") private WebElement loginBttn;
	@FindBy(xpath="//input[@class='email']")private WebElement emailTextbox;
	@FindBy(xpath="//input[@name='Password']")private WebElement passwordTextbox;
	@FindBy(xpath="//button[text()='Log in']")private WebElement loginBtn;
	@FindBy(xpath="//button[text()='Register']")private WebElement regBtn;
	@FindBy(xpath="//h1[text()='Welcome, Please Sign In!']")private WebElement wlcmText;
	
	
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String LoginToApp()
	{
		loginBttn.click();
		 return wlcmText.getText();
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void fillLoginForm()
	{
		emailTextbox.sendKeys("shital@gmail.com");
		passwordTextbox.sendKeys("admin");
		loginBtn.click();
	}
	public void regButtn()
	{
		regBtn.click();
	}
	

}
