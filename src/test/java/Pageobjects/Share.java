package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Share extends Basepage {

     	public Share(WebDriver driver) {
        super(driver);
       
    }
     	// WebElement for the Share product button
     	
     	@FindBy(xpath = "//i[@class='icon-product_share']")
     	WebElement shareproduct;
   
    	@FindBy(xpath="(//a[@target='_blank'])[5]")
     	WebElement whatsupicon;
     	
     	
     	public void Click() {
		shareproduct.click();
     	}
		public void click() {
		//whatsup whatsupicon = new whatsup();
		whatsupicon.click();
     	}

		}
	

