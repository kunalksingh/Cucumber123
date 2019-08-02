package com.stepdefenition1;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTarrifPlan1 {
	static WebDriver driver;
	@Given("User is in telecom home page..")
	public void user_is_in_telecom_home_page() {
		
			System.setProperty("webdriver.chrome.driver","D:\\selenium class appllication\\eclipse oxygen\\Cucumber\\driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://www.demo.guru99.com/telecom/");
		  
		}
	    
	

	@Given("User click on add tarrif.")
	public void user_click_on_add_tarrif() {
		
			driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}
	  
	/*@When("User is filling the form..")
	public void user_is_filling_the_form(DataTable cusData) {
		List<String> asList = cusData.asList(String.class);
		driver.findElement(By.id("rental1")).sendKeys(asList.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(asList.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(asList.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(asList.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(asList.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(asList.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(asList.get(6));
		
	    
	}*/
	/*@When("User is filling the form...")
	public void user_is_filling_the_form(DataTable cusData1) {
		Map<String,String> asMap = cusData1.asMap(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(asMap.get("rental"));
		driver.findElement(By.id("local_minutes")).sendKeys(asMap.get("local_minute"));
		driver.findElement(By.id("inter_minutes")).sendKeys(asMap.get("inter_minute"));
		driver.findElement(By.id("sms_pack")).sendKeys(asMap.get("sms_pac"));
		driver.findElement(By.id("minutes_charges")).sendKeys(asMap.get("minutes_charge"));
		driver.findElement(By.id("inter_charges")).sendKeys(asMap.get("inter_charge"));
		driver.findElement(By.id("sms_charges")).sendKeys(asMap.get("sms_charge"));
		
	    
	}*/
	
	/*@When("User is filling the form....")
	public void user_is_filling_the_form(DataTable cusDetails) {
		List<List<String>> asLists = cusDetails.asLists(String.class);
		driver.findElement(By.id("rental1")).sendKeys(asLists.get(0).get(1));
		driver.findElement(By.id("local_minutes")).sendKeys(asLists.get(1).get(2));
		driver.findElement(By.id("inter_minutes")).sendKeys(asLists.get(1).get(3));
		driver.findElement(By.id("sms_pack")).sendKeys(asLists.get(2).get(1));
		driver.findElement(By.id("minutes_charges")).sendKeys(asLists.get(3).get(1));
		driver.findElement(By.id("inter_charges")).sendKeys(asLists.get(3).get(4));
		driver.findElement(By.id("sms_charges")).sendKeys(asLists.get(2).get(5));
		
	    
	}*/
	@When("User is filling the form.....")
	public void user_is_filling_the_form(DataTable cusDetails) {
		List<Map<String,String>> asMaps = cusDetails.asMaps(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(asMaps.get(0).get("rental1"));
		driver.findElement(By.id("local_minutes")).sendKeys(asMaps.get(1).get("local_minutes"));
		driver.findElement(By.id("inter_minutes")).sendKeys(asMaps.get(1).get("inter_minutes"));
		driver.findElement(By.id("sms_pack")).sendKeys(asMaps.get(2).get("sms_pack"));
		driver.findElement(By.id("minutes_charges")).sendKeys(asMaps.get(3).get("sms_pack"));
		driver.findElement(By.id("inter_charges")).sendKeys(asMaps.get(3).get("inter_charges"));
		driver.findElement(By.id("sms_charges")).sendKeys(asMaps.get(2).get("sms_charges"));
	   
	}



	
	
   @When("User click on submit.")
	public void user_click_on_submit() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}
	   
	

	@Then("User should get a confirmation message.")
	public void user_should_get_a_confirmation_message() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	    
	}

	@Then("User click on home button.")
	public void user_click_on_home_button() {
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	}



}
