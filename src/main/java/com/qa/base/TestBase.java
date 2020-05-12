package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class TestBase {
	
	public static Properties prop;
	public static FileInputStream fin;
	public static WebDriver driver;
	public static int WAIT_TIME = 20;
	
	public TestBase() throws IOException 
	{
		prop = new Properties();
		fin = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fin);
	}

	public static void initialize() 
	{
		if(prop.getProperty("browser").contentEquals("chrome")) 
		{
			System.setProperty("webdriver.chrome.silentOutput", "true");
			System.setProperty("webdriver.chrome.driver", "F:\\Downloads Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(prop.getProperty("browser").contentEquals("firefox")) 
		{
			System.setProperty("webdriver.gecko.silentOutput", "true");
			System.setProperty("webdriver.gecko.driver", "F:\\Downloads Softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(prop.getProperty("browser").contentEquals("opera")) 
		{
			System.setProperty("webdriver.opera.silentOutput", "true");
			System.setProperty("webdriver.opera.driver", "F:\\Downloads Softwares\\operadriver.exe");
			driver = new OperaDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(WAIT_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
	}
}
