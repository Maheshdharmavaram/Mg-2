package Testcases;

import org.testng.annotations.Test;

import Pageobjects.wishlist;
import TestBase.BaseClass;

public class TC_009_wishlist extends BaseClass {
@Test
	public void verifywishlist() throws InterruptedException {
        driver.get("https://www.moglix.com/epson-ecotank-17-ipm-a3-plus-wi-fi-duplex-wide-format-all-in-one-ink-tank-printer-l14150/mp/msn2km1jpm7x9v");
        wishlist wl = new wishlist(driver);
        wl.wishlist_click();	
        Thread.sleep(2000);
		}
}
