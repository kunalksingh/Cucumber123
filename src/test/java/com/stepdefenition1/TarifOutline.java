package com.stepdefenition1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TarifOutline {
	static WebDriver driver;
	@Given("User is in telecom page.")
	public void user_is_in_telecom_page() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium class appllication\\eclipse oxygen\\Cucumber\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.demo.guru99.com/telecom/");
	    
	}

	@When("User is filling all the all details,{string},{string},{string},{string},{string},{string},{string}")
	public void user_is_filling_all_the_all_details(String A, String B, String C, String D, String E, String F, String G) {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		driver.findElement(By.id("rental1")).sendKeys(A);
		driver.findElement(By.id("local_minutes")).sendKeys(B);
		driver.findElement(By.id("inter_minutes")).sendKeys(C);
		driver.findElement(By.id("sms_pack")).sendKeys(D);
		driver.findElement(By.id("minutes_charges")).sendKeys(E);
		driver.findElement(By.id("inter_charges")).sendKeys(F);
		driver.findElement(By.id("sms_charges")).sendKeys(G);
		
		
	  
	}

	@When("User clik on submit button")
	public void user_clik_on_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();

	    
	}

	@Then("User should get a confirmation message..")
	public void user_should_get_a_confirmation_message() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	    
	}


	}



