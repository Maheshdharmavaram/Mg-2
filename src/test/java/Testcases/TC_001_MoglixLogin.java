package Testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pageobjects.HomePage;
import TestBase.BaseClass;
public class TC_001_MoglixLogin extends BaseClass {
	@Test
	public void clickloginNow() throws AWTException, InterruptedException  {
	HomePage hp = new HomePage(driver);
	hp.clickloginNow();
	hp.setphnnumber();
	Thread.sleep(4000);
	hp.countinue();

	

	    }
		
	}
	
