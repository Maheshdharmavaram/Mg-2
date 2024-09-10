package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class wishlist extends Basepage {

	public wishlist(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//i[@class='icon-wishlist1-inactive']")
	WebElement wishlisticon;
	
	public void wishlist_click() {
		wishlisticon.click();
		
	}
	
}

