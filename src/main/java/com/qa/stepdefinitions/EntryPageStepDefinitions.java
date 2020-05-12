package com.qa.stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;
import com.qa.util.Utilities;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class EntryPageStepDefinitions extends TestBase{

	
	String condition1 = "visibility";
	String condition2 = "clickable";
	
	Actions action;
	
	public EntryPageStepDefinitions() throws IOException {
		
		super();
		
	}

	@Given("^user opens the browser and website window$")
	public void user_opens_the_browser_and_website_window() {
		
	   initialize();
	   Assert.assertEquals("http://automationpractice.com/index.php",driver.getCurrentUrl());
	}

	@When("^user clicks on signin button$")
	public void user_clicks_on_signin_button() {
		
		driver.findElement(By.partialLinkText(prop.getProperty("signin_button_partiallinkText"))).click();
		
		Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//h3[text()='Already registered?']")), condition1);
		
		Assert.assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account",driver.getCurrentUrl());
	}

	@Then("^user enters username and password and logs in$")
	public void user_enters_and_logs_in(DataTable credentials) {
		
		List<List<String>> list = credentials.raw();
		driver.findElement(By.id(prop.getProperty("login_username_id"))).sendKeys(list.get(0).get(0));
		driver.findElement(By.id(prop.getProperty("login_password_id"))).sendKeys(list.get(0).get(1));
		
		
	  
	}

	@Then("^login page is opened$")
	public void login_page_is_opened() {
		
		driver.findElement(By.id(prop.getProperty("signin_button_id"))).click();
		Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//span[text()='A B']")), condition1);
		
		Assert.assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=my-account"));
	   
	}
	
	@Then("^user clicks on my wishlists$")
	public void user_clicks_on_my_wishlists() {
		
		Utilities.javaScriptClick(driver, driver.findElement(By.xpath("//span[text()='My wishlists']")));
	 
	}

	@Then("^user searches for items$")
	public void user_searches_for(DataTable cred) {
	
		Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//h3[text()='New wishlist']")), condition1);
		
		for(Map<String,String> mapDat : cred.asMaps(String.class, String.class)){
				
		Utilities.javaScriptSendKeys(driver, driver.findElement(By.id("search_query_top")), mapDat.get("items"));
		
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		
		Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//h1[@class='page-heading  product-listing']")), condition1);
	
		}
		
	}
		@Then("^user clicks on add to cart and checks out to open summary page$")
		public void user_clicks_on_add_to_cart_and_checks_out_to_open_summary_page() {
			
			
			List<WebElement> list = driver.findElements(By.xpath("//ul[@class='product_list grid row']/li"));
			int listCount = list.size();
			String bforeXpath = "//ul[@class='product_list grid row']/li[";
			String AftrXpath = "]/div/div/div[2]/a[@title='Add to cart']";
			
			if(listCount != 0) {
			 for(int i=1;i<=listCount;i++) { 
			
			action = new Actions(driver);
			
			action.moveToElement(driver.findElement(By.xpath(bforeXpath+i+"]/div"))).build().perform();
			
			driver.findElement(By.xpath(bforeXpath+i+AftrXpath)).click();
			
			driver.findElement(By.xpath("//span[@title='Close window']")).click();
			 }
			 
			 	Utilities.scrollBy(driver,-500);
				
				Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//a[@title='View my shopping cart']")), condition2);
				
				action.moveToElement(driver.findElement(By.xpath("//a[@title='View my shopping cart']"))).doubleClick().build().perform();
				
				Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.id("cart_title")), condition1);
				
				Assert.assertEquals("http://automationpractice.com/index.php?controller=order", driver.getCurrentUrl());

			 }else 
				{
					System.out.println("Please search a different item. ");
					
					driver.close();
				}
			 
	}

			 
		
			
		
		@Then("^user checks out to open address page and adds new address$")
		public void user_checks_out_to_open_address_page_and_adds_new_address(){
			
			Utilities.scrollBy(driver, 1000);
			driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']")).click();
			
			Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//h1[text()='Addresses']")), condition1);
			
			//driver.findElement(By.id("addressesAreEquals")).click();
			
			//Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//div[@id='address_invoice_form']/a[@title='Add']")), condition1);
			
			

			//Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//h1[text()='Addresses']")), condition1);

			
	}

		@Then("^user enters user credentials and save$")
		public void user_enters_and_save(DataTable credentials){
			
			
			for(Map<String, String> dataMap : credentials.asMaps(String.class, String.class)) {
			
				if(dataMap != null) {
					
					driver.findElement(By.xpath("//p[@class='address_add submit']/a[@title='Add']")).click();
					Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//h1[text()='Your addresses']")), condition1);
					driver.findElement(By.id("address1")).sendKeys(dataMap.get("address"));
					driver.findElement(By.id("city")).sendKeys(dataMap.get("city"));
			
					Select select = new Select(driver.findElement(By.id("id_state")));
					select.selectByVisibleText("Illinois");
			
					driver.findElement(By.id("postcode")).sendKeys(dataMap.get("postal code"));
			
					Select select1 = new Select(driver.findElement(By.id("id_country")));
					select1.selectByValue("21");
			
					driver.findElement(By.id("phone")).sendKeys(dataMap.get("homephone"));
					driver.findElement(By.id("phone_mobile")).sendKeys(dataMap.get("mobilephone"));
					driver.findElement(By.id("alias")).sendKeys(dataMap.get("addressTitle"));
			
					driver.findElement(By.id("submitAddress")).click();
			

					}
					
		}
			//driver.findElement(By.xpath("//a[@class='btn btn-defaul button button-small']")).click();
	}
		@Then("^user proceeds to check out and opens shipping page$")
		public void user_proceeds_to_check_out_and_opens_shipping_page() {
		
			Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//h1[text()='Addresses']")), condition1);
			driver.findElement(By.xpath("//button[@name='processAddress']")).click();
			
			Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//h1[text()='Shipping']")), condition1);
			driver.findElement(By.id("cgv")).click();
		
		}

		@Then("^user checks out to payment and pays by wire$")
		public void user_checks_out_to_payment_and_pays_by_wire() {
			
			driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
			Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//h1[text()='Please choose your payment method']")), condition1);

			driver.findElement(By.xpath("//a[@class='bankwire']")).click();
			Utilities.explicitWait(driver, WAIT_TIME, driver.findElement(By.xpath("//h3[contains(text(),'Bank-wire payment')]")), condition1);
			
		}

		@Then("^user confirms order$")
		public void user_confirms_order() {
			
			driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
			
			
		}



		
	

	
	@And("^browser is closed$")
	public void browser_is_closed() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.quit();
	}
}
