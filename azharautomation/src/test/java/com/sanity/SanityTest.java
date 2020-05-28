package com.sanity;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;
import com.generic.code.CartFuction;
import com.generic.code.DressSelection;
import com.generic.code.Payment;

public class SanityTest {
	
	static WebDriver driver;//null
	
	public static void main(String[] args) throws Throwable {
		
		//before all
		driver =BaseLogin.getLogin();//setup ==> login 1
		
		
		
		DressSelection obj = new DressSelection();
		obj.getDress(driver);//select dress 2
		
		CartFuction obj2 = new CartFuction();
		obj2.getAddDressInCart(driver);// add dress in my shopping cart 3
		
		
		Payment.getPayment(driver);//pay 4
		
		//After all
		
		driver.quit();
		
		
	}

}
