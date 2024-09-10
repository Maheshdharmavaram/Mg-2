package Testcases;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.annotations.Test;
    import Pageobjects.Share;
import TestBase.BaseClass;

    public class TC_007_shareproduct extends BaseClass {
        
        @Test
        public void ShareProduct() throws InterruptedException {
            
        	// Initialize WebDriver
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            // Navigate to the Moglix website
            driver.get("https://www.moglix.com");
            driver.get("https://www.moglix.com/epson-ecotank-17-ipm-a3-plus-wi-fi-duplex-wide-format-all-in-one-ink-tank-printer-l14150/mp/msn2km1jpm7x9v");
           
            // Click the Share product button
            Share sp= new Share(driver);
            sp.Click(); 
            
            //whatsup wi = new whatsup();
            sp.click();
            Thread.sleep(2000);
         
        
        }
    }

