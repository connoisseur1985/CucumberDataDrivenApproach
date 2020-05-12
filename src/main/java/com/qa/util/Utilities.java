package com.qa.util;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;
public class Utilities  {


	public static void explicitWait(WebDriver driver, int time,WebElement webelement, String condition) 
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		
		if(condition.contentEquals("visibility")) {
		
			wait.until(ExpectedConditions.visibilityOf(webelement));
		
		}else if(condition.contentEquals("clickable")) {
			
			wait.until(ExpectedConditions.elementToBeClickable(webelement));
		
		}
		
	}

	public static void javaScriptClick(WebDriver driver,WebElement w) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);

		js.executeScript("arguments[0].click();", w);
	}

	public static void javaScriptSendKeys(WebDriver driver,WebElement w,String value) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);

		js.executeScript("arguments[0].value='"+value+"';", w);
	}

	public static void scrollBy(WebDriver driver, int yaxis) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);

		js.executeScript("window.scrollBy(0,"+yaxis+");", "");
	}

}