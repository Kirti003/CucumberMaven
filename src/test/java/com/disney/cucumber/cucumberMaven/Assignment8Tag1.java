package com.disney.cucumber.cucumberMaven;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Assignment8Tag1 extends CommonCucumber  {


	
	@Before
	public void beforetest(){
		
		CommonCucumber cm= new CommonCucumber();
		cm.initial();
	}
	
	
	
	@Given("User launched the applications$")
	public void user_launched_the_applications() throws Throwable {
		//CommonCucumber cm= new CommonCucumber();
		//cm.initial();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	@When("^User enters credentials$")
	public void user_enters_credentials() throws Throwable {
	driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
	driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[2]")).sendKeys("kirti3dec@gmail.com");
	// (By.xpath("(//a[@value='MAA'])[2]")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qwerty");
	
	}

	@When("^click on Signin buttonss$")
	public void click_on_Signin_buttonss() throws Throwable {
		driver.findElement(By.name("SubmitLogin")).click();
	}

	@Then("^User should be able to logins$") 
	public void user_should_be_able_to_logins() throws Throwable {
		if (driver.getPageSource().contains("kirti singhal")){
			System.out.println("User Verified as kirti");
		}
		
	
	}



}
