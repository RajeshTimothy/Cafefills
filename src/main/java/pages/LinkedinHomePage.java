package pages;

import org.openqa.selenium.By;

import utils.Reporter;
import wrappers.LinkedinWrappers;

public class LinkedinHomePage extends LinkedinWrappers  {
	public LinkedinHomePage() {
		if(!verifyTitle("Welcome! | LinkedIn"))
		Reporter.reportStep("This is not Home Page", "FAIL");
	}
	public LinkedinHomePage getHomePageWelcomemsg (String xpath, String text){
		verifyTextByXpath("//*[@id='hp-promo-abk-social']/div[1]/h3", text);
				return this;
	}
	
	public LinkedinHomePage clickHomePageAdvanceLink(String name){
		driver.findElement(By.linkText("Advanced")).click();
		//return new LinkedinAdvancePage; 
	}
	public LinkedinHomePage clickHomePageAdvanceLink(String name){
		driver.findElement(By.linkText("Advanced")).click();
		return new LinkedinAdvancePage; 
	
	}


