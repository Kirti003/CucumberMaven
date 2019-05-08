package com.disney.cucumber.cucumberMaven;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Assignment8Tag2 extends CommonCucumber {
	
	@Before
	public void beforetest(){
		
		CommonCucumber cm= new CommonCucumber();
		cm.initial();
	}
	
	@When("^User selects 'Women' from navigation bar$")
	public void user_selects_Women_from_navigation_bar() throws Throwable {
	 WebElement  Category = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]"));
	 Actions action1 = new Actions(driver);
	 action1.moveToElement(Category).build().perform();
	 WebElement Window = driver.findElement(By.xpath("//li[@class='sfHoverForce sfHover']"));
	 action1.moveToElement(Window);
	 
	}

	@When("^Select 'Tops' option in drop down list$")
	public void select_Tops_option_in_drop_down_list() throws Throwable {
	WebElement SubCategory = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Tops')]"));
	
	 Actions action2 = new Actions(driver);
	 action2.moveToElement(SubCategory).build().perform();
	 System.out.println(SubCategory.getText());
	 action2.click(SubCategory);
	
	}

	@Then("^User is taken to the tops section in the women category$")
	public void user_is_taken_to_the_tops_section_in_the_women_category()  {
		WebElement TopBreadcrum = driver.findElement(By.xpath("//h2[@class='title_block'][contains(text(),'Tops')]"));
		
		if(TopBreadcrum.isDisplayed()){
			
			System.out.println("We are under Tops section");
		}
	    
	}


	

}
