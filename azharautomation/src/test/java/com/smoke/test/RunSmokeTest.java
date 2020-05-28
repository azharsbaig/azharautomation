package com.smoke.test;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;

public class RunSmokeTest {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		driver=BaseLogin.getLogin();
	}

}
