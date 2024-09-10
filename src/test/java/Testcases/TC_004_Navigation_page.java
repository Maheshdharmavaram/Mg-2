package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pageobjects.Navigation_page;
import TestBase.BaseClass;

public class TC_004_Navigation_page  extends BaseClass {

	    @Test
	    public void verifyNavigation() throws InterruptedException {
	        Navigation_page np = new Navigation_page(driver);
	        np.navigation();
	        np.navigation2();
	        np.navigation3();
	        
	  
}
}
