package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	public class productCart extends Basepage {
		public productCart(WebDriver driver) {
			super(driver);
			
		}

		@FindBy(xpath="//h1[@class='prod-name heading']")
	    WebElement product;
	   	

	    @FindBy(xpath = "//input[@id='product_quantity']")
	    WebElement quantityField;

	    @FindBy(xpath = "//button[@class='btn add-to-cart-btn default-btn']")
	    WebElement addToCartButton;

	    @FindBy(xpath = "//a[@class='icon-cart1']")
	    WebElement cartIcon;

	    @FindBy(xpath = "(//button[@class='btn primary-full-btn'])[1]")
	    WebElement checkoutButton;
	    
	    
	    // Methods to perform actions

	    public void product() {
	    	product.click();
	    	
	    }

	    public void setQuantity(String quantity)   {
	    	quantityField.clear();
	        quantityField.sendKeys(quantity);
	    }

	    public void clickAddToCartButton() {
	        addToCartButton.click();
	    }

	    public void clickCartIcon() {
	        cartIcon.click();
	    }

	    public void clickCheckoutButton() {
	        checkoutButton.click();
	        
	        
	    }
	}    
	        
	        