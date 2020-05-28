package com.generic.code;

import org.openqa.selenium.WebDriver;

import com.page.object.model.ProductPage;
import com.util.Highlighter;

public class DressSelection {
	
	public  WebDriver getDress(WebDriver driver){
		
		ProductPage pf = new ProductPage(driver);// 2
		pf.getdressesbtn().click();

		int totalNo = pf.getdressesCount().size();
		System.out.println("Total dress displayed = " + totalNo);

		pf.getallDressName().forEach(name->{
			
			System.out.println("Found dress name = "+name.getText());
			
		});

		pf.getallDressPrice().forEach(price ->{
			
			System.out.println("Found dress price = "+ price.getText());
		});
		
		new Highlighter().getcolor(driver, pf.getallDressName().get(4), "green", "red");
		pf.getallDressName().get(4).click();
		
		return driver;
	}

}
