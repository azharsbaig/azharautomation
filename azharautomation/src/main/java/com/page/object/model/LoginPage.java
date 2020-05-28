package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//Page Object Modal ==== PageFactory

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);// Selenium dev added==>driver null value
	}

	@FindBy(xpath = "// *[@class='login']")
	private WebElement login;
	@FindBy(xpath = "//*[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//*[@id='passwd']")
	private WebElement pass;
	@FindBy(xpath = "//*[@id='SubmitLogin']")
	private WebElement submit;
	@FindBy(xpath ="//*[id='log out']")
	private WebElement logout;
	@FindBy(xpath="//*[class='search']")
	private WebElement search;
	
	//*[@class='right-block']//*[@class='price product-price']== price
	
	//*[@class='right-block']//*[@class='product-name']==> product name
	
	 public WebElement getsearch(){
		
	return 	search;
	}
	
	
	
	public WebElement getlogout(){
		return logout;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
