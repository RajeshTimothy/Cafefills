package pages;

import utils.Reporter;
import wrappers.LinkedinWrappers;

public class LinkedinLoginPage extends LinkedinWrappers {
	public  LinkedinLoginPage(){
		if(!verifyTitle("Linkedin Open Source ERP + CRM"))
			Reporter.reportStep("This is not Login Page", "FAIL");
	}
     public LinkedinLoginPage linkedinlaunchBrowser(String browser){
    	 invokeApp(browser);
		return this;		
	}
	public LinkedinLoginPage enterUserName(String idValue, String data){
		enterById("login-email",data);
		return this;
	}
	
	public LinkedinLoginPage enterPassword(String idValue, String data){
		enterById("login-password",data);
		return this;
	}
	public LinkedinHomePage clickLinkedinSignin(String classVal){
		enterById("submit", classVal);
		return new LinkedinHomePage();
	}
}
