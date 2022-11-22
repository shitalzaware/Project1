package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.Testbase;
import Utility.ReadExcel;

public class RegisterPage  extends Testbase{
	
	//object repo
	@FindBy(xpath="//h1[text()='Register']")private WebElement registerText;
	@FindBy(xpath="//label[text()='Female']")private WebElement genderCheckbox;
	@FindBy(xpath="//input[@id='FirstName']")private WebElement fnameTextbox;
	@FindBy(xpath="//input[@id='LastName']")private WebElement lastnameTextBox;
	@FindBy(xpath="//select[@name='DateOfBirthDay']")private WebElement dayDropDown;
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")private WebElement monthDropDown;
	@FindBy(xpath="//select[@name='DateOfBirthYear']")private WebElement yearDropDown;
	@FindBy(xpath="//input[@name='Email']")private WebElement emailTextBox;
	@FindBy(xpath="//input[@name='Password']")private WebElement passwordTextBox;
	@FindBy(xpath="//input[@name='ConfirmPassword']")private WebElement cnfrmPswTextBox;
	@FindBy(xpath="//button[@name='register-button']")private WebElement regBtn;
	@FindBy(xpath="//h1[text()='Register']")private WebElement RegisteredText;
	@FindBy(xpath="//div[text()='Your registration completed']")private WebElement RegisteredPageText;
	@FindBy(xpath="//a[text()='Continue']")private WebElement continueBtn;
	
	
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void fillFrom() throws Exception
	{
		genderCheckbox.click();
		fnameTextbox.sendKeys(ReadExcel.readExcelfile(1, 0));
		lastnameTextBox.sendKeys(ReadExcel.readExcelfile(1, 1));
		 
		Select s=new Select(dayDropDown);
		s.selectByVisibleText(ReadExcel.readExcelfile(1, 2));
		Select s1=new Select(monthDropDown);
		s1.selectByVisibleText(ReadExcel.readExcelfile(1, 3));
		Select s3=new Select(yearDropDown);
		s3.selectByVisibleText(ReadExcel.readExcelfile(1, 4));
		emailTextBox.sendKeys(ReadExcel.readExcelfile(1, 5));
		passwordTextBox.sendKeys(ReadExcel.readExcelfile(1, 6));
		cnfrmPswTextBox.sendKeys(ReadExcel.readExcelfile(1, 7));
		regBtn.click();
		
		
		
	}
	
	public String successfulReg()
	{
			return 	RegisteredText.getText();
	}
	public String successfulRegText() throws Exception
	{
			Thread.sleep(2000);
			return 	RegisteredPageText.getText();
	}
	
	
	public String verifyTitle()
	{
		 return driver.getTitle();
		
	}
	
	public void continueBtn()
	{
		continueBtn.click();
	}
	
	

}
