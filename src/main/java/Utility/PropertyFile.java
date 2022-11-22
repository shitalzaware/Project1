package Utility;

import java.io.FileInputStream;

import java.util.Properties;

import Base.Testbase;

public class PropertyFile extends Testbase {
	
	public static String ReadPropertyFile(String value) throws Exception
	{
		Properties prop= new Properties();
		
		FileInputStream file= new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\NopCom\\TestData\\config.Property");
		prop.load(file);
		return prop.getProperty(value);
		
	}

}
