package com.sanity;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.code.BaseLogin;
import com.generic.code.CartFuction;
import com.generic.code.DressSelection;
import com.generic.code.Payment;

public class SanityTest2 {//Testng framework

	 WebDriver driver;
	
	@BeforeTest
	public void setup() throws Throwable {
	
		driver =BaseLogin.getLogin();
		
	}
	
	@Test
	public void sanity1() {
		
		DressSelection obj = new DressSelection();
		obj.getDress(driver);//select dress 2	
		
	}
	@Test
	public void sanity2() {
		CartFuction obj2 = new CartFuction();
		obj2.getAddDressInCart(driver);// add dres	
			
	}
	@Test
	public void sanity3() {
		
		Payment.getPayment(driver);//pay 4
	}
	
	
	@AfterTest
	public void teardown() {
		
		driver.quit();
	}
	
	
}
