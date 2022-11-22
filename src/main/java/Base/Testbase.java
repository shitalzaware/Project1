package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.PropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

	public static  WebDriver driver;
	
	public void initialization() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(PropertyFile.ReadPropertyFile("URL"));
		
		

		
	}

}
