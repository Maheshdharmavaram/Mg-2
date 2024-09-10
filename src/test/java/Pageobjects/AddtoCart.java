//package Pageobjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//
//public class AddtoCart extends Basepage {
//public AddtoCart(WebDriver driver) {
//		super(driver);
//	
//	}
//
//		@FindBy(xpath="//h1[text()=\"Apple iPhone 15 6.1 inch 6GB/256GB Storage Blue Smartphone\"]")
//	    WebElement product;
//	   
//	    
//	    @FindBy(xpath = "//input[@id='product_quantity']")
//	    WebElement quantityField;
//
//	    @FindBy(xpath = "//button[@class='btn add-to-cart-btn default-btn']")
//	    WebElement addToCartButton;
//
//	    @FindBy(xpath = "//a[@class='icon-cart1']")
//	    WebElement cartIcon;
//
//	    @FindBy(xpath = "//button[@class='btn primary-full-btn']")
//	    WebElement checkoutButton;
//
//	    // Methods to perform actions
//
//	    public void product1() {
//	    	product.click();
//	    	
//	    }
//
//	    public void setQuantity(String quantity)   {
//	    	quantityField.clear();
//	        quantityField.sendKeys(quantity);
//	    }
//
//	    public void clickAddToCartButton() {
//	        addToCartButton.click();
//	    }
//
//	    public void clickCartIcon() {
//	        cartIcon.click();
//	    }
//
//	    public void clickCheckoutButton() {
//	        checkoutButton.click();
//	    }
//	
//	    
//}
//
//
//	 