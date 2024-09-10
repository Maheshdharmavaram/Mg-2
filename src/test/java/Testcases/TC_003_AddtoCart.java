//package Testcases;
//
//import org.testng.annotations.Test;
//
//import Pageobjects.AddtoCart;
//import TestBase.BaseClass;
//
//public class TC_003_AddtoCart extends BaseClass {
//
//	 @Test
//	    public void verifyAddToCart() throws InterruptedException {
//	        driver.get("https://www.moglix.com/apple-iphone-15-61-inch-6gb-256gb-storage-blue-smartphone/mp/msn8580onvel92");
//
//	        AddtoCart addToCartPage = new AddtoCart(driver);
//	        
//	      
//	        //Thread.sleep(2000);
//	        
//	        	addToCartPage.product1();
//	        	Thread.sleep(2000); 
//		        
//		        addToCartPage.setQuantity("2");
//		        addToCartPage.clickAddToCartButton();
//		        
//		       
//		        Thread.sleep(6000); 
//		        
//		        addToCartPage.clickCartIcon();
//		        
//		        Thread.sleep(6000);
//		        addToCartPage.clickCheckoutButton();
//	        
//	        
//	    }
//	}
//
//
//
//
