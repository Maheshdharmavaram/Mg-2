package Testcases;

import org.testng.annotations.Test;

import Pageobjects.productCart;
import TestBase.BaseClass;

public class TC_006_productCart6 extends BaseClass{
	@Test
	public void verifyAddToCart6() throws InterruptedException {
		
		driver.get("https://www.moglix.com/epson-ecotank-17-ipm-a3-plus-wi-fi-duplex-wide-format-all-in-one-ink-tank-printer-l14150/mp/msn2km1jpm7x9v");
		
		 productCart ac = new productCart(driver);
	        
	      //Thread.sleep(2000);
	        
		 ac.product();
	        
	      
	        Thread.sleep(2000); 
		        
		        ac.setQuantity("2");
		        ac.clickAddToCartButton();
		        
		       
		        Thread.sleep(6000); 
		        
		        ac.clickCartIcon();
		        
		        Thread.sleep(6000);
		        ac.clickCheckoutButton();
		
		
		
	}
}
