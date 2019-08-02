package com.stepdefenition1;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;


public class AddTarrifPlan {
	static WebDriver driver;
	@Given("User is in telecom home page.")
	public void user_is_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium class appllication\\eclipse oxygen\\Cucumber\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.demo.guru99.com/telecom/");
	  
	}

	@Given("User click on add tarrif")
	public void user_click_on_add_tarrif() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	  
	}

	@When("User is filling the form")
	public void user_is_filling_the_form() {
		driver.findElement(By.id("rental1")).sendKeys("1199");
		driver.findElement(By.id("local_minutes")).sendKeys("60");
		driver.findElement(By.id("inter_minutes")).sendKeys("30");
		driver.findElement(By.id("sms_pack")).sendKeys("5");
		driver.findElement(By.id("minutes_charges")).sendKeys("10");
		driver.findElement(By.id("inter_charges")).sendKeys("5");
		driver.findElement(By.id("sms_charges")).sendKeys("1");
		
	   
	}
	
  @When("User click on submit")
	public void user_click_on_submit() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	}

	@Then("User should get a confirmation message")
	public void user_should_get_a_confirmation_message() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	   
	}

	@Then("User click on home button")
	public void user_click_on_home_button() {
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	   
	}






}
