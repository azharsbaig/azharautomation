package com.generic.code;

import org.openqa.selenium.WebDriver;

import com.page.object.model.ProductPage;
import com.util.Highlighter;
import com.util.TakeAppScreenShot;

public class Payment {
	
	
	public static WebDriver getPayment(WebDriver driver){
		
		ProductPage pf = new ProductPage(driver);// 2
		new Highlighter().getcolor(driver, pf.getpaymentOptions().get(0), "green", "red");
		pf.getpaymentOptions().get(0).click();//select payment
		
		new Highlighter().getcolor(driver, pf.getorderConfirmedBtn().get(0), "green", "red");
		pf.getorderConfirmedBtn().get(0).click();
				
		new Highlighter().getcolor(driver, pf.getorderSummary());
		System.out.println(pf.getorderSummary().getText());
		
		TakeAppScreenShot.captureScreenShot(driver, "My Order Summary");
		
		
	return driver;	
	}

}
