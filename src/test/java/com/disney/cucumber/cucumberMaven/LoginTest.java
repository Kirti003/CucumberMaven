package com.disney.cucumber.cucumberMaven;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends CommonCucumber {

	// @Before
	

	// @After

	@Given("^User launched the application$")
	public void user_launched_the_application() throws Throwable {
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}

	@When("^User enter credentials$")
	public void user_enter_credentials() throws Throwable {
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("divy");
		driver.findElement(By.name("lastName")).sendKeys("singhal");
		driver.findElement(By.name("phone")).sendKeys("123456");
		driver.findElement(By.id("userName")).sendKeys("kirti3dec@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("#123, Sector-1");
		driver.findElement(By.name("address2")).sendKeys("address2");
		driver.findElement(By.name("city")).sendKeys("gurgaon");
		driver.findElement(By.name("state")).sendKeys("haryana");
		driver.findElement(By.name("postalCode")).sendKeys("122016");
		driver.findElement(By.name("country")).sendKeys("ANDORRA");

	}

	@When("^click on Signin button$")
	public void click_on_Signin_button() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("divy");
		driver.findElement(By.name("password")).sendKeys("qwerty");
		driver.findElement(By.name("confirmPassword")).sendKeys("qwerty");
		driver.findElement(By.name("register")).click();

	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		if (driver.getPageSource().contains("Dear")) {
			System.out.println("User Verified");
		} else {
			System.out.println("User not Verified");
		}

	}

}
