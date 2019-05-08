package com.disney.cucumber.cucumberMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonCucumber {

	static WebDriver driver = null;
	public void initial(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\singhalk\\Downloads\\Setup\\chromedriver.exe");
		 driver = new ChromeDriver();	
	}
	

}
