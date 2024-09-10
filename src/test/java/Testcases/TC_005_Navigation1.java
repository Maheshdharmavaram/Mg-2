package Testcases;

import org.testng.annotations.Test;

import Pageobjects.Navigation1;
import TestBase.BaseClass;

public class TC_005_Navigation1  extends BaseClass {

@Test
public void verifyNavigation1() throws InterruptedException {
    Navigation1 np = new Navigation1(driver);
    np.navigation();
    np.navigation2();
    np.navigation3();
   
}
}
