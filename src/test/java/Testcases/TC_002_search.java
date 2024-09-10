package Testcases;

import org.testng.annotations.Test;

import Pageobjects.searchpage;
import TestBase.BaseClass;

public class TC_002_search extends BaseClass {
    @Test
    public void verifySearch() throws InterruptedException {
        driver.get("https://www.moglix.com/");

        searchpage sp = new searchpage(driver);
        sp.enterSearchTerm("iphone15");
        sp.clickSubmitButton();

      
    }
}


