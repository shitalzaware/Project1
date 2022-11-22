package Pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.Testbase;

public class productListing extends Testbase {
	
	//object repo
	
	@FindBy(xpath="//a[text()='Apparel '][1]")private WebElement apparelBttn;
	@FindBy(xpath="//a[text()='Shoes '][1]")private WebElement shoesBtn;
	@FindBy(xpath="//img[@alt='Picture of adidas Consortium Campus 80s Running Shoes']")private WebElement selecProd;
	@FindBy(xpath="//select[@name='product_attribute_9']")private WebElement prodsize;
	@FindBy(xpath="//option[text()='9']")private WebElement size;
	@FindBy(xpath="//li[@data-attr-value='25']")private WebElement colorProd;
	@FindBy(xpath="//button[@class='button-1 add-to-cart-button']")private WebElement addToCartBtn;
	@FindBy(xpath="//span[@class='close']")private WebElement close;
	@FindBy(xpath="//span[@class='cart-label']")private WebElement shppingCartBtn;
	@FindBy(xpath="//input[@id='termsofservice']")private WebElement checkBox;
	@FindBy(xpath="//button[@id='checkout']")private WebElement checkoutBttn; 
	@FindBy(xpath="//select[@name='BillingNewAddress.CountryId']")private WebElement countryAdd;
	@FindBy(xpath="//input[@name='BillingNewAddress.City']")private WebElement cityAdd;
	@FindBy(xpath="//input[@name='BillingNewAddress.Address1']")private WebElement address;
	@FindBy(xpath="//input[@name='BillingNewAddress.ZipPostalCode']")private WebElement zipAdd;
	@FindBy(xpath="//input[@name='BillingNewAddress.PhoneNumber']")private WebElement mobileNo;
	@FindBy(xpath="//button[@onclick='Billing.save()']")private WebElement finalCtn;
	@FindBy(xpath="//button[@onclick='ShippingMethod.save()']")private WebElement checkoutCont;
	@FindBy(xpath="//button[@onclick='PaymentMethod.save()']")private WebElement paymentCheckout;
	@FindBy(xpath="//button[@onclick='PaymentInfo.save()']")private WebElement paymentinfoCheckout;
	@FindBy(xpath="//button[@onclick='ConfirmOrder.save()']")private WebElement confirmPgaeCheckout;
	@FindBy(xpath="//h1[text()='Thank you']")private WebElement thankyoutext;
	@FindBy(xpath="//strong[text()='Your order has been successfully processed!']")private WebElement successfullyProc;
//	@FindBy(xpath="//button[@onclick='ConfirmOrder.save()']")private WebElement confirmPgaeCheckout;
	
	
	
	
	public productListing()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void addProduct() throws Exception
	{
		Actions act =new Actions(driver);
		act.moveToElement(apparelBttn).build().perform();
		for(int i=0;i<=3;i++)
		{
			act.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
			i=1;
			break;
		}
		
		shoesBtn.click();
		Thread.sleep(2000);
		
		act.moveToElement(selecProd).click().perform();
		act.click(prodsize).click().build().perform();
		for(int i=0;i<=3;i++)
		{
			act.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
			i=2;
			break;
		}
		size.click();
		colorProd.click();
		addToCartBtn.click();
		close.click();
		Thread.sleep(3000);
		//act.click(shppingCartBtn).click().build().perform();
		act.moveToElement(shppingCartBtn).click().build().perform();
		//shppingCartBtn.click();
		Thread.sleep(2000);
		act.moveToElement(checkBox).click().build().perform();
		Thread.sleep(2000);
		checkoutBttn.click();
		
		Thread.sleep(3000);
		
		
	}
	
	public void shippingprod() throws Exception {
		
		Actions act =new Actions(driver);
		act.moveToElement(checkBox).click().build().perform();
		Thread.sleep(2000);
		checkoutBttn.click();
		
		Thread.sleep(3000);
		
	}

	
	public void checkoutPage()
	{
		Select s=new Select(countryAdd);
		s.selectByVisibleText("India");
		cityAdd.sendKeys("pune");
		address.sendKeys("pune");
		zipAdd.sendKeys("411014");
		mobileNo.sendKeys("9665");
		finalCtn.click();
	}
	
	public void shippingMethod()
	{
		checkoutCont.click();
		paymentCheckout.click();
		paymentinfoCheckout.click();
		confirmPgaeCheckout.click();
	}
	
	public String successfullyDone()
	{
		return thankyoutext.getText();
		
	}
	
	public String successfullyDone2()
	{
		return successfullyProc.getText();
	}
	
}
